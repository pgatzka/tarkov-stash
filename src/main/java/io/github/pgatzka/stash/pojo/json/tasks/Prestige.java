package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Prestige(
        @JsonProperty(value = "conditions", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Condition @NonNull [] conditions,
        @JsonProperty(value = "iconLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String iconLink,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "imageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String imageLink,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "prestigeLevel", required = true) @JsonSetter(nulls = Nulls.FAIL) int prestigeLevel,
        @JsonProperty(value = "rewards", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Rewards rewards,
        @JsonProperty(value = "transferSettings", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull TransferSetting @NonNull [] transferSettings
) {
}
