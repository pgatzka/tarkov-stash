package io.github.pgatzka.stash.pojo.json.traders;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Level(
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "insuranceRate") @Nullable Double insuranceRate,
        @JsonProperty(value = "level", required = true) @JsonSetter(nulls = Nulls.FAIL) int level,
        @JsonProperty(value = "payRate", required = true) @JsonSetter(nulls = Nulls.FAIL) double payRate,
        @JsonProperty(value = "repairCostMultiplier") @Nullable Double repairCostMultiplier,
        @JsonProperty(value = "requiredCommerce", required = true) @JsonSetter(nulls = Nulls.FAIL) int requiredCommerce,
        @JsonProperty(value = "requiredPlayerLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int requiredPlayerLevel,
        @JsonProperty(value = "requiredReputation", required = true) @JsonSetter(nulls = Nulls.FAIL) double requiredReputation
) {
}
