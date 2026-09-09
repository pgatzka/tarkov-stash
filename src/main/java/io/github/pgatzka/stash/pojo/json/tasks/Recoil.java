package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Recoil(
        @JsonProperty(value = "compareMethod", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String compareMethod,
        @JsonProperty(value = "value", required = true) @JsonSetter(nulls = Nulls.FAIL) int value
) {
}
