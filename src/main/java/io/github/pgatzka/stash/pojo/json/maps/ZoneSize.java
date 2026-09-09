package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public record ZoneSize(
        @JsonProperty(value = "x", required = true) @JsonSetter(nulls = Nulls.FAIL) int x,
        @JsonProperty(value = "y", required = true) @JsonSetter(nulls = Nulls.FAIL) int y,
        @JsonProperty(value = "z", required = true) @JsonSetter(nulls = Nulls.FAIL) int z
) {
}
