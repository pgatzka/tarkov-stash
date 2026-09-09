package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Activate(
        @JsonProperty(value = "operation", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String operation,
        @JsonProperty(value = "switch", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String switch_
) {
}
