package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Zone(
        @JsonProperty(value = "botom", required = true) @JsonSetter(nulls = Nulls.FAIL) int botom,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "outline", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ZoneOutline @NonNull [] outline,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ZonePosition position,
        @JsonProperty(value = "size", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ZoneSize size,
        @JsonProperty(value = "top", required = true) @JsonSetter(nulls = Nulls.FAIL) int top
) {
}
