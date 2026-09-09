package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record TraderRequirement(
        @JsonProperty(value = "compareMethod", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String compareMethod,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "requirementType", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String requirementType,
        @JsonProperty(value = "trader", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String trader,
        @JsonProperty(value = "value", required = true) @JsonSetter(nulls = Nulls.FAIL) int value
) {
}
