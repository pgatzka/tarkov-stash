package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Mastering(
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "level2", required = true) @JsonSetter(nulls = Nulls.FAIL) int level2,
        @JsonProperty(value = "level3", required = true) @JsonSetter(nulls = Nulls.FAIL) int level3,
        @JsonProperty(value = "weapons", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] weapons
) {
}
