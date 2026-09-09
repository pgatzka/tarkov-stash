package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.Nullable;

public record TransferSetting(
        @JsonProperty(value = "gridHeight") @Nullable Integer gridHeight,
        @JsonProperty(value = "gridWidth") @Nullable Integer gridWidth,
        @JsonProperty(value = "itemFilters") @Nullable ItemFilters itemFilters,
        @JsonProperty(value = "name") @Nullable String name,
        @JsonProperty(value = "skillType") @Nullable String skillType,
        @JsonProperty(value = "transferRate") @Nullable Double transferRate
) {
}
