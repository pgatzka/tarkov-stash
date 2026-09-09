package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record DataTasks2(
        @JsonProperty(value = "availableDelaySecondsMax") @Nullable Integer availableDelaySecondsMax,
        @JsonProperty(value = "availableDelaySecondsMin") @Nullable Integer availableDelaySecondsMin,
        @JsonProperty(value = "experience", required = true) @JsonSetter(nulls = Nulls.FAIL) int experience,
        @JsonProperty(value = "factionName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String factionName,
        @JsonProperty(value = "failConditions", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FailCondition @NonNull [] failConditions,
        @JsonProperty(value = "failureOutcome", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FailureOutcome failureOutcome,
        @JsonProperty(value = "finishRewards", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FinishRewards finishRewards,
        @JsonProperty(value = "gameMode") @NonNull String @Nullable [] gameMode,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "kappaRequired", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean kappaRequired,
        @JsonProperty(value = "lightkeeperRequired", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean lightkeeperRequired,
        @JsonProperty(value = "map") @Nullable String map,
        @JsonProperty(value = "minPlayerLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int minPlayerLevel,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "neededKeys") @NonNull NeededKey @Nullable [] neededKeys,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName,
        @JsonProperty(value = "objectives", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Objective @NonNull [] objectives,
        @JsonProperty(value = "otherRequirements") @NonNull OtherRequirement @Nullable [] otherRequirements,
        @JsonProperty(value = "requiredPrestige") @Nullable String requiredPrestige,
        @JsonProperty(value = "restartable", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean restartable,
        @JsonProperty(value = "startRewards", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull StartRewards startRewards,
        @JsonProperty(value = "taskImageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String taskImageLink,
        @JsonProperty(value = "taskRequirements", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull TaskRequirement @NonNull [] taskRequirements,
        @JsonProperty(value = "trader", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String trader,
        @JsonProperty(value = "traderRequirements", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull TraderRequirement @NonNull [] traderRequirements,
        @JsonProperty(value = "wikiLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String wikiLink
) {
}
