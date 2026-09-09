package io.github.pgatzka.stash.pojo.json.traders;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record ReputationLevel(
        @JsonProperty(value = "availableScavExtracts", required = true) @JsonSetter(nulls = Nulls.FAIL) int availableScavExtracts,
        @JsonProperty(value = "btrCoveringFireDiscount", required = true) @JsonSetter(nulls = Nulls.FAIL) int btrCoveringFireDiscount,
        @JsonProperty(value = "btrDeliveryDiscount", required = true) @JsonSetter(nulls = Nulls.FAIL) int btrDeliveryDiscount,
        @JsonProperty(value = "btrDeliveryGridSize", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull BtrDeliveryGridSize btrDeliveryGridSize,
        @JsonProperty(value = "btrEnabled", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean btrEnabled,
        @JsonProperty(value = "btrTaxiDiscount", required = true) @JsonSetter(nulls = Nulls.FAIL) int btrTaxiDiscount,
        @JsonProperty(value = "extractPriceModifier", required = true) @JsonSetter(nulls = Nulls.FAIL) double extractPriceModifier,
        @JsonProperty(value = "hostileBosses", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean hostileBosses,
        @JsonProperty(value = "hostileScavs", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean hostileScavs,
        @JsonProperty(value = "minimumReputation", required = true) @JsonSetter(nulls = Nulls.FAIL) int minimumReputation,
        @JsonProperty(value = "priceModifier", required = true) @JsonSetter(nulls = Nulls.FAIL) double priceModifier,
        @JsonProperty(value = "scavAttackSupport", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean scavAttackSupport,
        @JsonProperty(value = "scavCaseTimeModifier", required = true) @JsonSetter(nulls = Nulls.FAIL) double scavCaseTimeModifier,
        @JsonProperty(value = "scavCooldownModifier", required = true) @JsonSetter(nulls = Nulls.FAIL) double scavCooldownModifier,
        @JsonProperty(value = "scavEquipmentSpawnChanceModifier", required = true) @JsonSetter(nulls = Nulls.FAIL) int scavEquipmentSpawnChanceModifier,
        @JsonProperty(value = "scavFollowChance", required = true) @JsonSetter(nulls = Nulls.FAIL) double scavFollowChance
) {
}
