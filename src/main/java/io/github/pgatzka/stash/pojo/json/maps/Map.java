package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Map(
        @JsonProperty(value = "accessKeys", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] accessKeys,
        @JsonProperty(value = "accessKeysMinPlayerLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int accessKeysMinPlayerLevel,
        @JsonProperty(value = "artillery") @Nullable Artillery artillery,
        @JsonProperty(value = "bosses", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Bosse @NonNull [] bosses,
        @JsonProperty(value = "btrStops", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull BtrStop @NonNull [] btrStops,
        @JsonProperty(value = "coordinateToCardinalRotation", required = true) @JsonSetter(nulls = Nulls.FAIL) double coordinateToCardinalRotation,
        @JsonProperty(value = "description", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String description,
        @JsonProperty(value = "enemies", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] enemies,
        @JsonProperty(value = "extracts", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Extract @NonNull [] extracts,
        @JsonProperty(value = "hazards", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Hazard @NonNull [] hazards,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "locks", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Lock @NonNull [] locks,
        @JsonProperty(value = "lootContainers", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull MapLootContainer @NonNull [] lootContainers,
        @JsonProperty(value = "lootLoose", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull LootLoose @NonNull [] lootLoose,
        @JsonProperty(value = "maxPlayerLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int maxPlayerLevel,
        @JsonProperty(value = "minPlayerLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int minPlayerLevel,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "nameId", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String nameId,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName,
        @JsonProperty(value = "players", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String players,
        @JsonProperty(value = "raidDuration", required = true) @JsonSetter(nulls = Nulls.FAIL) int raidDuration,
        @JsonProperty(value = "scenePath", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String scenePath,
        @JsonProperty(value = "spawns", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Spawn @NonNull [] spawns,
        @JsonProperty(value = "stationaryWeapons", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull MapStationaryWeapon @NonNull [] stationaryWeapons,
        @JsonProperty(value = "switches", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Switche @NonNull [] switches,
        @JsonProperty(value = "transits", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Transit @NonNull [] transits,
        @JsonProperty(value = "wiki", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String wiki
) {
}
