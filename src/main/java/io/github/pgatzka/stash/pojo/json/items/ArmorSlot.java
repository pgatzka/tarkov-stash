package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record ArmorSlot(
        @JsonProperty(value = "allowedPlates") @NonNull String @Nullable [] allowedPlates,
        @JsonProperty(value = "armorMaterial") @Nullable String armorMaterial,
        @JsonProperty(value = "armorType") @Nullable String armorType,
        @JsonProperty(value = "baseValue") @Nullable Integer baseValue,
        @JsonProperty(value = "bluntThroughput") @Nullable Double bluntThroughput,
        @JsonProperty(value = "class") @Nullable Integer class_,
        @JsonProperty(value = "durability") @Nullable Integer durability,
        @JsonProperty(value = "ergoPenalty") @Nullable Double ergoPenalty,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "nameId", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String nameId,
        @JsonProperty(value = "repairCost") @Nullable Integer repairCost,
        @JsonProperty(value = "ricochetX") @Nullable Double ricochetX,
        @JsonProperty(value = "ricochetY") @Nullable Double ricochetY,
        @JsonProperty(value = "ricochetZ") @Nullable Integer ricochetZ,
        @JsonProperty(value = "speedPenalty") @Nullable Double speedPenalty,
        @JsonProperty(value = "turnPenalty") @Nullable Double turnPenalty,
        @JsonProperty(value = "zones", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] zones
) {
}
