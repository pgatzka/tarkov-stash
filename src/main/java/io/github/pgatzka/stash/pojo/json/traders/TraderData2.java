package io.github.pgatzka.stash.pojo.json.traders;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record TraderData2(
        @JsonProperty(value = "buyAllowed", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull BuyAllowed buyAllowed,
        @JsonProperty(value = "buyProhibited", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull BuyProhibited buyProhibited,
        @JsonProperty(value = "currency", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String currency,
        @JsonProperty(value = "description", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String description,
        @JsonProperty(value = "discount", required = true) @JsonSetter(nulls = Nulls.FAIL) int discount,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "imageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String imageLink,
        @JsonProperty(value = "levels", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Level @NonNull [] levels,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName,
        @JsonProperty(value = "reputationLevels", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ReputationLevel @NonNull [] reputationLevels,
        @JsonProperty(value = "resetTime", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String resetTime
) {
}
