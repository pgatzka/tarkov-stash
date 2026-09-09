package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Spawn(
        @JsonProperty(value = "categories", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] categories,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull SpawnPosition position,
        @JsonProperty(value = "sides", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] sides,
        @JsonProperty(value = "zoneName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String zoneName
) {
}
