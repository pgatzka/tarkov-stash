package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Switche(
        @JsonProperty(value = "activatedBy", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String activatedBy,
        @JsonProperty(value = "activates", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Activate @NonNull [] activates,
        @JsonProperty(value = "bottom", required = true) @JsonSetter(nulls = Nulls.FAIL) double bottom,
        @JsonProperty(value = "door") @Nullable String door,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "outline", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull SwitcheOutline @NonNull [] outline,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull SwitchePosition position,
        @JsonProperty(value = "size", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull SwitcheSize size,
        @JsonProperty(value = "switchType", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String switchType,
        @JsonProperty(value = "top", required = true) @JsonSetter(nulls = Nulls.FAIL) double top
) {
}
