package io.github.pgatzka.stash.pojo.json.crafts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Data(
        @JsonProperty(value = "duration", required = true) @JsonSetter(nulls = Nulls.FAIL) int duration,
        @JsonProperty(value = "gameEditions", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] gameEditions,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "level", required = true) @JsonSetter(nulls = Nulls.FAIL) int level,
        @JsonProperty(value = "productItem", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ProductItem productItem,
        @JsonProperty(value = "requiredItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull RequiredItem @NonNull [] requiredItems,
        @JsonProperty(value = "requiredQuestItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull RequiredQuestItem @NonNull [] requiredQuestItems,
        @JsonProperty(value = "station", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String station,
        @JsonProperty(value = "taskUnlock") @Nullable String taskUnlock
) {
}
