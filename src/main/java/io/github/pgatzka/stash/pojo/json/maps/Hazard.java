package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Hazard(
        @JsonProperty(value = "bottom") @Nullable Double bottom,
        @JsonProperty(value = "hazardType", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String hazardType,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "outline", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull HazardOutline @NonNull [] outline,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull HazardPosition position,
        @JsonProperty(value = "size") @Nullable HazardSize size,
        @JsonProperty(value = "top") @Nullable Double top
) {
}
