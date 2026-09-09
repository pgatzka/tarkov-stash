package io.github.pgatzka.stash.pojo.json.barters;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.Nullable;

public record RequiredItemAttributes(
        @JsonProperty(value = "minLevel") @Nullable Integer minLevel
) {
}
