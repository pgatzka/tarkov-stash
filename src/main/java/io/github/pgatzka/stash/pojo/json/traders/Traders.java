package io.github.pgatzka.stash.pojo.json.traders;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Traders(
        @JsonProperty(value = "data", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull TraderData data,
        @JsonProperty(value = "data{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull TraderData2 data__,
        @JsonProperty(value = "translations", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] translations
) {
}
