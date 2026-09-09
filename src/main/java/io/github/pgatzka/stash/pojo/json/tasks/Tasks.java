package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Tasks(
        @JsonProperty(value = "data", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Data data,
        @JsonProperty(value = "translations", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] translations
) {
}
