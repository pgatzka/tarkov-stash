package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record OtherRequirement(
        @JsonProperty(value = "compareMethod") @Nullable String compareMethod,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "traders") @NonNull String @Nullable [] traders,
        @JsonProperty(value = "type", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String type,
        @JsonProperty(value = "value") @Nullable Integer value,
        @JsonProperty(value = "variableId") @Nullable String variableId
) {
}
