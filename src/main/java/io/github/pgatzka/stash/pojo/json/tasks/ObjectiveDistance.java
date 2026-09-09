package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.Nullable;

public record ObjectiveDistance(
        @JsonProperty(value = "compareMethod") @Nullable String compareMethod,
        @JsonProperty(value = "value") @Nullable Integer value
) {
}
