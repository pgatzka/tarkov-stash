package io.github.pgatzka.stash.pojo.json.hideout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Bonuse(
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "passive", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean passive,
        @JsonProperty(value = "production", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean production,
        @JsonProperty(value = "skill") @Nullable String skill,
        @JsonProperty(value = "slotItems") @NonNull String @Nullable [] slotItems,
        @JsonProperty(value = "type", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String type,
        @JsonProperty(value = "value", required = true) @JsonSetter(nulls = Nulls.FAIL) double value
) {
}
