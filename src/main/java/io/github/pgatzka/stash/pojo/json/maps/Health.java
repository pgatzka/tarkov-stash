package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Health(
        @JsonProperty(value = "bodyPart", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String bodyPart,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "max", required = true) @JsonSetter(nulls = Nulls.FAIL) int max
) {
}
