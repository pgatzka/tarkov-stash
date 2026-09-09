package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record SpawnLocation(
        @JsonProperty(value = "chance", required = true) @JsonSetter(nulls = Nulls.FAIL) double chance,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "positions", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull SpawnLocationPosition @NonNull [] positions,
        @JsonProperty(value = "spawnKey", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String spawnKey
) {
}
