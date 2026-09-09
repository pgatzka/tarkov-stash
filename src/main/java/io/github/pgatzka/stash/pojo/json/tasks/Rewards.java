package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Rewards(
        @JsonProperty(value = "achievement", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] achievement,
        @JsonProperty(value = "craftUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] craftUnlock,
        @JsonProperty(value = "customization", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull RewardCustomization @NonNull [] customization,
        @JsonProperty(value = "items", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull RewardItem @NonNull [] items,
        @JsonProperty(value = "locationUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] locationUnlock,
        @JsonProperty(value = "offerUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] offerUnlock,
        @JsonProperty(value = "skillLevelReward", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull RewardSkillLevelReward @NonNull [] skillLevelReward,
        @JsonProperty(value = "traderDialogueUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] traderDialogueUnlock,
        @JsonProperty(value = "traderStanding", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] traderStanding,
        @JsonProperty(value = "traderUnlock", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] traderUnlock
) {
}
