package io.github.pgatzka.stash.pojo.json.crafts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Crafts(
        @JsonProperty(value = "data", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Data @NonNull [] data,
        @JsonProperty(value = "translations", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] translations
) {
}
