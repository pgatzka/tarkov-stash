package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record PlayerHealthEffect(
        @JsonProperty(value = "bodyParts") @NonNull String @Nullable [] bodyParts,
        @JsonProperty(value = "effects") @NonNull String @Nullable [] effects,
        @JsonProperty(value = "time") @Nullable PlayerHealthEffectTime time
) {
}
