package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record DataAchievements2(
        @JsonProperty(value = "adjustedPlayersCompletedPercent", required = true) @JsonSetter(nulls = Nulls.FAIL) double adjustedPlayersCompletedPercent,
        @JsonProperty(value = "description", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String description,
        @JsonProperty(value = "hidden", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean hidden,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "imageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String imageLink,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName,
        @JsonProperty(value = "normalizedRarity", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedRarity,
        @JsonProperty(value = "normalizedSide", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedSide,
        @JsonProperty(value = "playersCompletedPercent", required = true) @JsonSetter(nulls = Nulls.FAIL) double playersCompletedPercent,
        @JsonProperty(value = "rarity", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String rarity,
        @JsonProperty(value = "side", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String side
) {
}
