package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record FinishRewardSkillLevelReward(
        @JsonProperty(value = "level", required = true) @JsonSetter(nulls = Nulls.FAIL) int level,
        @JsonProperty(value = "skill", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String skill
) {
}
