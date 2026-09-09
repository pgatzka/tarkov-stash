package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record ItemAttributes(
        @JsonProperty(value = "difficulty", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String difficulty,
        @JsonProperty(value = "prevalence", required = true) @JsonSetter(nulls = Nulls.FAIL) double prevalence
) {
}
