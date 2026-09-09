package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record FailureOutcome(
        @JsonProperty(value = "achievement", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] achievement,
        @JsonProperty(value = "craftUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] craftUnlock,
        @JsonProperty(value = "customization", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] customization,
        @JsonProperty(value = "items", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] items,
        @JsonProperty(value = "locationUnlock") @NonNull Object @Nullable [] locationUnlock,
        @JsonProperty(value = "offerUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] offerUnlock,
        @JsonProperty(value = "skillLevelReward", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] skillLevelReward,
        @JsonProperty(value = "traderDialogueUnlock") @NonNull Object @Nullable [] traderDialogueUnlock,
        @JsonProperty(value = "traderStanding", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FailureOutcomeTraderStanding @NonNull [] traderStanding,
        @JsonProperty(value = "traderUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] traderUnlock
) {
}
