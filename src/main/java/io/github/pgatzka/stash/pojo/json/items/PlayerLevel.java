package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record PlayerLevel(
        @JsonProperty(value = "exp", required = true) @JsonSetter(nulls = Nulls.FAIL) int exp,
        @JsonProperty(value = "level", required = true) @JsonSetter(nulls = Nulls.FAIL) int level,
        @JsonProperty(value = "levelBadgeImageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String levelBadgeImageLink
) {
}
