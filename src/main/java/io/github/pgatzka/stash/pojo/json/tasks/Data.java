package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import java.util.Map;
import org.jspecify.annotations.NonNull;

public record Data(
        @JsonProperty(value = "achievements", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull Achievement> achievements,
        @JsonProperty(value = "prestige", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Prestige @NonNull [] prestige,
        @JsonProperty(value = "questItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull QuestItem> questItems,
        @JsonProperty(value = "tasks", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull Task> tasks
) {
}
