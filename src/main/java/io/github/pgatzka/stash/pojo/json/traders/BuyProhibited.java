package io.github.pgatzka.stash.pojo.json.traders;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record BuyProhibited(
        @JsonProperty(value = "category", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] category,
        @JsonProperty(value = "items", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] items
) {
}
