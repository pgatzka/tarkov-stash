package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import java.util.Map;
import org.jspecify.annotations.NonNull;

public record Data(
        @JsonProperty(value = "goonReports", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] goonReports,
        @JsonProperty(value = "lootContainers", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull DataLootContainer> lootContainers,
        @JsonProperty(value = "maps", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull Map> maps,
        @JsonProperty(value = "mobs", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull Mob> mobs,
        @JsonProperty(value = "stationaryWeapons", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull DataStationaryWeapon> stationaryWeapons
) {
}
