package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record SellToTrader(
        @JsonProperty(value = "currency", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String currency,
        @JsonProperty(value = "currencyItem", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String currencyItem,
        @JsonProperty(value = "price", required = true) @JsonSetter(nulls = Nulls.FAIL) int price,
        @JsonProperty(value = "priceRUB", required = true) @JsonSetter(nulls = Nulls.FAIL) int priceRUB,
        @JsonProperty(value = "trader", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String trader
) {
}
