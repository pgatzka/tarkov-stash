package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Objective(
        @JsonProperty(value = "bodyParts") @NonNull String @Nullable [] bodyParts,
        @JsonProperty(value = "buildAttributes") @Nullable BuildAttributes buildAttributes,
        @JsonProperty(value = "compareMethod") @Nullable String compareMethod,
        @JsonProperty(value = "containsAll") @NonNull String @Nullable [] containsAll,
        @JsonProperty(value = "containsCategory") @NonNull String @Nullable [] containsCategory,
        @JsonProperty(value = "count") @Nullable Integer count,
        @JsonProperty(value = "description", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String description,
        @JsonProperty(value = "distance") @Nullable ObjectiveDistance distance,
        @JsonProperty(value = "dogTagLevel") @Nullable Integer dogTagLevel,
        @JsonProperty(value = "effects") @NonNull String @Nullable [] effects,
        @JsonProperty(value = "enemyHealthEffect") @Nullable EnemyHealthEffect enemyHealthEffect,
        @JsonProperty(value = "exitName") @Nullable String exitName,
        @JsonProperty(value = "exitStatus") @NonNull String @Nullable [] exitStatus,
        @JsonProperty(value = "foundInRaid") @Nullable Boolean foundInRaid,
        @JsonProperty(value = "globalVariable") @Nullable GlobalVariable globalVariable,
        @JsonProperty(value = "healthEffect") @Nullable HealthEffect healthEffect,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "item") @Nullable String item,
        @JsonProperty(value = "items") @NonNull String @Nullable [] items,
        @JsonProperty(value = "level") @Nullable Integer level,
        @JsonProperty(value = "maps") @NonNull String @Nullable [] maps,
        @JsonProperty(value = "markerItem") @Nullable String markerItem,
        @JsonProperty(value = "maxDurability") @Nullable String maxDurability,
        @JsonProperty(value = "minDurability") @Nullable String minDurability,
        @JsonProperty(value = "notWearing") @NonNull NotWearing @Nullable [] notWearing,
        @JsonProperty(value = "optional", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean optional,
        @JsonProperty(value = "playerHealthEffect") @Nullable PlayerHealthEffect playerHealthEffect,
        @JsonProperty(value = "possibleLocations") @NonNull PossibleLocation @Nullable [] possibleLocations,
        @JsonProperty(value = "questItem") @Nullable String questItem,
        @JsonProperty(value = "requiredKeys") @NonNull String @NonNull [] @Nullable [] requiredKeys,
        @JsonProperty(value = "shotType") @Nullable String shotType,
        @JsonProperty(value = "skill") @Nullable String skill,
        @JsonProperty(value = "status") @NonNull String @Nullable [] status,
        @JsonProperty(value = "targetNames") @NonNull String @Nullable [] targetNames,
        @JsonProperty(value = "task") @Nullable String task,
        @JsonProperty(value = "timeFromHour") @Nullable Integer timeFromHour,
        @JsonProperty(value = "timeUntilHour") @Nullable Integer timeUntilHour,
        @JsonProperty(value = "trader") @Nullable String trader,
        @JsonProperty(value = "traders") @NonNull String @Nullable [] traders,
        @JsonProperty(value = "type", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String type,
        @JsonProperty(value = "useAny") @NonNull String @Nullable [] useAny,
        @JsonProperty(value = "usingWeapon") @NonNull String @Nullable [] usingWeapon,
        @JsonProperty(value = "usingWeaponMods") @NonNull String @NonNull [] @Nullable [] usingWeaponMods,
        @JsonProperty(value = "value") @Nullable Integer value,
        @JsonProperty(value = "wearing") @NonNull Wearing @NonNull [] @Nullable [] wearing,
        @JsonProperty(value = "zones") @NonNull ObjectiveZone @Nullable [] zones
) {
}
