package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Escort(
        @JsonProperty(value = "amount", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Amount @NonNull [] amount,
        @JsonProperty(value = "mob", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String mob
) {
}
