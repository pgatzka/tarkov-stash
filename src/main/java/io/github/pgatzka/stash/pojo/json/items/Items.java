package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Items(
        @JsonProperty(value = "data", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Data data,
        @JsonProperty(value = "translations", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] translations
) {
}
