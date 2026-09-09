package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record FleaMarket(
        @JsonProperty(value = "enabled", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean enabled,
        @JsonProperty(value = "foundInRaidRequired", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean foundInRaidRequired,
        @JsonProperty(value = "minPlayerLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int minPlayerLevel,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName,
        @JsonProperty(value = "reputationLevels", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ReputationLevel @NonNull [] reputationLevels,
        @JsonProperty(value = "sellOfferFeeRate", required = true) @JsonSetter(nulls = Nulls.FAIL) double sellOfferFeeRate,
        @JsonProperty(value = "sellRequirementFeeRate", required = true) @JsonSetter(nulls = Nulls.FAIL) double sellRequirementFeeRate
) {
}
