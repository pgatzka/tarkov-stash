package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record StimEffect(
        @JsonProperty(value = "chance", required = true) @JsonSetter(nulls = Nulls.FAIL) double chance,
        @JsonProperty(value = "delay", required = true) @JsonSetter(nulls = Nulls.FAIL) int delay,
        @JsonProperty(value = "duration", required = true) @JsonSetter(nulls = Nulls.FAIL) int duration,
        @JsonProperty(value = "percent", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean percent,
        @JsonProperty(value = "skill") @Nullable String skill,
        @JsonProperty(value = "type", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String type,
        @JsonProperty(value = "value", required = true) @JsonSetter(nulls = Nulls.FAIL) double value
) {
}
