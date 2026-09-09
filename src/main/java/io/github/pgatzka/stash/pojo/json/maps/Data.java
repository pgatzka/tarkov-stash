package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Data(
        @JsonProperty(value = "goonReports", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] goonReports,
        @JsonProperty(value = "lootContainers", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataLootContainers lootContainers,
        @JsonProperty(value = "lootContainers{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataLootContainers2 lootContainers__,
        @JsonProperty(value = "maps", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataMaps maps,
        @JsonProperty(value = "maps{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataMaps2 maps__,
        @JsonProperty(value = "mobs", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataMobs mobs,
        @JsonProperty(value = "mobs{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataMobs2 mobs__,
        @JsonProperty(value = "stationaryWeapons", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataStationaryWeapons stationaryWeapons,
        @JsonProperty(value = "stationaryWeapons{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataStationaryWeapons2 stationaryWeapons__
) {
}
