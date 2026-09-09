package io.github.pgatzka.stash.pojo.json.hideout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Level(
        @JsonProperty(value = "bonuses", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Bonuse @NonNull [] bonuses,
        @JsonProperty(value = "constructionTime", required = true) @JsonSetter(nulls = Nulls.FAIL) int constructionTime,
        @JsonProperty(value = "description", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String description,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "itemRequirements", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ItemRequirement @NonNull [] itemRequirements,
        @JsonProperty(value = "level", required = true) @JsonSetter(nulls = Nulls.FAIL) int level,
        @JsonProperty(value = "skillRequirements", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull SkillRequirement @NonNull [] skillRequirements,
        @JsonProperty(value = "stationLevelRequirements", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull StationLevelRequirement @NonNull [] stationLevelRequirements,
        @JsonProperty(value = "traderRequirements", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull TraderRequirement @NonNull [] traderRequirements
) {
}
