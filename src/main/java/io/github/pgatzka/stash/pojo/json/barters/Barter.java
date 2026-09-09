package io.github.pgatzka.stash.pojo.json.barters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Barter(
        @JsonProperty(value = "buyLimit", required = true) @JsonSetter(nulls = Nulls.FAIL) int buyLimit,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "minTraderLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int minTraderLevel,
        @JsonProperty(value = "offeredItem", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull OfferedItem offeredItem,
        @JsonProperty(value = "requiredItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull RequiredItem @NonNull [] requiredItems,
        @JsonProperty(value = "restockAmount", required = true) @JsonSetter(nulls = Nulls.FAIL) int restockAmount,
        @JsonProperty(value = "taskUnlock") @Nullable String taskUnlock,
        @JsonProperty(value = "trader", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String trader
) {
}
