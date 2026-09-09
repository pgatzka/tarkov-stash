package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record BuyFromTrader(
        @JsonProperty(value = "buyLimit") @Nullable Integer buyLimit,
        @JsonProperty(value = "currency", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String currency,
        @JsonProperty(value = "currencyItem", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String currencyItem,
        @JsonProperty(value = "minTraderLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int minTraderLevel,
        @JsonProperty(value = "price", required = true) @JsonSetter(nulls = Nulls.FAIL) int price,
        @JsonProperty(value = "priceRUB", required = true) @JsonSetter(nulls = Nulls.FAIL) int priceRUB,
        @JsonProperty(value = "restockAmount", required = true) @JsonSetter(nulls = Nulls.FAIL) int restockAmount,
        @JsonProperty(value = "taskUnlock") @Nullable String taskUnlock,
        @JsonProperty(value = "trader", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String trader
) {
}
