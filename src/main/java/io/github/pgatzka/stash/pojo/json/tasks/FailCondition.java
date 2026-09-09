package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record FailCondition(
        @JsonProperty(value = "bodyParts") @NonNull Object @Nullable [] bodyParts,
        @JsonProperty(value = "compareMethod") @Nullable String compareMethod,
        @JsonProperty(value = "count") @Nullable Integer count,
        @JsonProperty(value = "description", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String description,
        @JsonProperty(value = "distance") @Nullable FailConditionDistance distance,
        @JsonProperty(value = "dogTagLevel") @Nullable Integer dogTagLevel,
        @JsonProperty(value = "enemyHealthEffect") @Nullable Integer enemyHealthEffect,
        @JsonProperty(value = "exitStatus") @NonNull String @Nullable [] exitStatus,
        @JsonProperty(value = "foundInRaid") @Nullable Boolean foundInRaid,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "items") @NonNull String @Nullable [] items,
        @JsonProperty(value = "maps") @NonNull String @Nullable [] maps,
        @JsonProperty(value = "maxDurability") @Nullable Integer maxDurability,
        @JsonProperty(value = "minDurability") @Nullable Integer minDurability,
        @JsonProperty(value = "notWearing") @NonNull Object @Nullable [] notWearing,
        @JsonProperty(value = "optional", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean optional,
        @JsonProperty(value = "playerHealthEffect") @Nullable Integer playerHealthEffect,
        @JsonProperty(value = "shotType") @Nullable String shotType,
        @JsonProperty(value = "status") @NonNull String @Nullable [] status,
        @JsonProperty(value = "targetNames") @NonNull String @Nullable [] targetNames,
        @JsonProperty(value = "task") @Nullable String task,
        @JsonProperty(value = "timeFromHour") @Nullable Integer timeFromHour,
        @JsonProperty(value = "timeUntilHour") @Nullable Integer timeUntilHour,
        @JsonProperty(value = "trader") @Nullable String trader,
        @JsonProperty(value = "type", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String type,
        @JsonProperty(value = "useAny") @NonNull String @Nullable [] useAny,
        @JsonProperty(value = "usingWeapon") @NonNull Object @Nullable [] usingWeapon,
        @JsonProperty(value = "usingWeaponMods") @NonNull Object @Nullable [] usingWeaponMods,
        @JsonProperty(value = "value") @Nullable Integer value,
        @JsonProperty(value = "wearing") @NonNull Object @Nullable [] wearing,
        @JsonProperty(value = "zones") @NonNull FailConditionZone @Nullable [] zones
) {
}
