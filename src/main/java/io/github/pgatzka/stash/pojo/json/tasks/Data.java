package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Data(
        @JsonProperty(value = "achievements", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataAchievements achievements,
        @JsonProperty(value = "achievements{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataAchievements2 achievements__,
        @JsonProperty(value = "prestige", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Prestige @NonNull [] prestige,
        @JsonProperty(value = "questItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataQuestItems questItems,
        @JsonProperty(value = "questItems{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataQuestItems2 questItems__,
        @JsonProperty(value = "tasks", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataTasks tasks,
        @JsonProperty(value = "tasks{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataTasks2 tasks__
) {
}
