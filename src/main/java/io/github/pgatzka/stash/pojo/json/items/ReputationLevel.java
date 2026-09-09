package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public record ReputationLevel(
        @JsonProperty(value = "maxRep", required = true) @JsonSetter(nulls = Nulls.FAIL) double maxRep,
        @JsonProperty(value = "minRep", required = true) @JsonSetter(nulls = Nulls.FAIL) double minRep,
        @JsonProperty(value = "offers", required = true) @JsonSetter(nulls = Nulls.FAIL) int offers,
        @JsonProperty(value = "offersSpecialEditions", required = true) @JsonSetter(nulls = Nulls.FAIL) int offersSpecialEditions
) {
}
