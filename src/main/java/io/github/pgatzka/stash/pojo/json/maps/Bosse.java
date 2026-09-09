package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Bosse(
        @JsonProperty(value = "escorts", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Escort @NonNull [] escorts,
        @JsonProperty(value = "mob", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String mob,
        @JsonProperty(value = "spawnChance", required = true) @JsonSetter(nulls = Nulls.FAIL) double spawnChance,
        @JsonProperty(value = "spawnLocations", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull SpawnLocation @NonNull [] spawnLocations,
        @JsonProperty(value = "spawnTime", required = true) @JsonSetter(nulls = Nulls.FAIL) int spawnTime,
        @JsonProperty(value = "spawnTimeRandom") @Nullable Boolean spawnTimeRandom,
        @JsonProperty(value = "spawnTrigger") @Nullable String spawnTrigger,
        @JsonProperty(value = "supports", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] supports,
        @JsonProperty(value = "switch") @Nullable String switch_,
        @JsonProperty(value = "switch_id") @Nullable String switch_id
) {
}
