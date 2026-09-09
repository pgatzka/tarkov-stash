package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record PossibleLocation(
        @JsonProperty(value = "map", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String map,
        @JsonProperty(value = "positions", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull PossibleLocationPosition @NonNull [] positions
) {
}
