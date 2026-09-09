package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record BtrStop(
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "x", required = true) @JsonSetter(nulls = Nulls.FAIL) double x,
        @JsonProperty(value = "y", required = true) @JsonSetter(nulls = Nulls.FAIL) double y,
        @JsonProperty(value = "z", required = true) @JsonSetter(nulls = Nulls.FAIL) double z
) {
}
