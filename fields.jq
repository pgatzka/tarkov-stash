# fields.jq — infer a flat field list from any JSON document.
#
#   Usage:  jq -rn --stream -f fields.jq data.json
#
# Works on a single document, a top-level array, or NDJSON, and never loads the
# file into memory. Array elements are collapsed into one path with [].
#
# Output, one line per distinct field path:
#
#   $[].id: string
#   $[].name: string (nullable)
#   $[].price: int (nullable)
#   $[].durability: double (nullable)
#
# Typing rules: every field starts as a non-null int and is widened by the
# values actually observed anywhere at that path —
#
#   null value, or key absent from some instances -> (nullable)
#   floating point value                          -> double
#   boolean value                                 -> boolean
#   string value                                  -> string
#
# Later rules win, so precedence is string > boolean > object > array >
# double > int. A field that is null in every record stays int (nullable).

# ---------- helpers ----------

def tp:
  if . == null then "null"
  elif type == "number" then (if . == floor then "long" else "double" end)
  else type end;

def np:
  reduce .[] as $k ("$";
    if ($k | type) == "number" then . + "[]" else . + "." + $k end);

def javatype:
  (. - ["null"]) as $t
  | if   ($t | length) == 0      then "int"
    elif ($t | index("string"))  then "string"
    elif ($t | index("boolean")) then "boolean"
    elif ($t | index("object"))  then "object"
    elif ($t | index("array"))   then "array"
    elif ($t | index("double"))  then "double"
    else "int" end;

# ---------- scan ----------

reduce inputs as $e (
  { s: {}, prev: null };

  if ($e | length) == 1 then
    # a 1-length event closes a container; at depth <= 1 it ends a whole
    # document, so reset prev and let the next document count its own root
    (if ($e[0] | length) <= 1 then .prev = null else . end)
  else
    ($e[0]) as $p | ($e[1]) as $v |

    # register every ancestor container of this leaf. the stream is depth-first
    # in document order, so a container instance is new exactly when its
    # concrete path differs from the previous leaf's at that depth.
    reduce range(0; $p | length) as $i (.;
      if (.prev | .[0:$i]) != ($p[0:$i]) then
          ($p[0:$i] | np) as $ap
        | (if ($p[$i] | type) == "number" then "array" else "object" end) as $at
        | .s[$ap].n += 1
        | .s[$ap].types[$at] += 1
        | .s[$ap].parent = (if $i == 0 then null else ($p[0:$i-1] | np) end)
        | .s[$ap].iskey = ($i > 0 and ($p[$i-1] | type) == "string")
      else . end
    )

    # register the leaf itself
    | ($p | np) as $lp
    | .s[$lp].n += 1
    | .s[$lp].types[($v | tp)] += 1
    | .s[$lp].parent = ($p[0:-1] | np)
    | .s[$lp].iskey = (($p[-1] | type) == "string")
    | .prev = $p
  end
)

# ---------- report ----------

| .s as $s
| $s
| to_entries
| map(
    .key as $path | .value as $v
    # how many instances of the parent container exist; if the field appears
    # fewer times than that, it is missing from some of them
  | (if $v.parent == null then 1 else ($s[$v.parent].n // 1) end) as $pn
  | { path: $path,
      jtype: ($v.types | keys | javatype),
      nullable: (($v.types | has("null")) or ($v.iskey and $v.n < $pn)) }
)
| sort_by(.path)
| .[]
| "\(.path): \(.jtype)\(if .nullable then " (nullable)" else "" end)"
