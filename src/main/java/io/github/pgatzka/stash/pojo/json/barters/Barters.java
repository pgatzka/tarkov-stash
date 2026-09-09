package io.github.pgatzka.stash.pojo.json.barters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Barters(
        @JsonProperty(value = "data", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Barter @NonNull [] data,
        @JsonProperty(value = "translations", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] translations
) {
}
