package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record ObjectiveZone(
        @JsonProperty(value = "bottom", required = true) @JsonSetter(nulls = Nulls.FAIL) double bottom,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "map", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String map,
        @JsonProperty(value = "name") @Nullable String name,
        @JsonProperty(value = "outline", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ZoneOutline2 @NonNull [] outline,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ZonePosition2 position,
        @JsonProperty(value = "size") @Nullable Size size,
        @JsonProperty(value = "terrainElevation") @Nullable Double terrainElevation,
        @JsonProperty(value = "top", required = true) @JsonSetter(nulls = Nulls.FAIL) double top
) {
}
