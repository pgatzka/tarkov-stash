package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record TaskRequirement(
        @JsonProperty(value = "notes") @Nullable String notes,
        @JsonProperty(value = "status", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] status,
        @JsonProperty(value = "task", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String task
) {
}
