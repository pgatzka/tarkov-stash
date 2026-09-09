package io.github.pgatzka.stash.pojo.json.crafts;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.Nullable;

public record RequiredItemAttributes(
        @JsonProperty(value = "functional") @Nullable Boolean functional,
        @JsonProperty(value = "tool") @Nullable Boolean tool
) {
}
