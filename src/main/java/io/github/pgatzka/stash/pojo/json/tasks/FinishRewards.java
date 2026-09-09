package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record FinishRewards(
        @JsonProperty(value = "achievement", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] achievement,
        @JsonProperty(value = "craftUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FinishRewardCraftUnlock @NonNull [] craftUnlock,
        @JsonProperty(value = "customization", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FinishRewardCustomization @NonNull [] customization,
        @JsonProperty(value = "items", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FinishRewardItem @NonNull [] items,
        @JsonProperty(value = "locationUnlock") @NonNull Object @Nullable [] locationUnlock,
        @JsonProperty(value = "offerUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FinishRewardOfferUnlock @NonNull [] offerUnlock,
        @JsonProperty(value = "skillLevelReward", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FinishRewardSkillLevelReward @NonNull [] skillLevelReward,
        @JsonProperty(value = "traderDialogueUnlock") @NonNull String @Nullable [] traderDialogueUnlock,
        @JsonProperty(value = "traderStanding", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FinishRewardTraderStanding @NonNull [] traderStanding,
        @JsonProperty(value = "traderUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] traderUnlock
) {
}
