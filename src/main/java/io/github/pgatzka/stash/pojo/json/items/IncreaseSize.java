package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.Nullable;

public record IncreaseSize(
        @JsonProperty(value = "down") @Nullable Integer down,
        @JsonProperty(value = "left") @Nullable Integer left,
        @JsonProperty(value = "right") @Nullable Integer right,
        @JsonProperty(value = "up") @Nullable Integer up
) {
}
