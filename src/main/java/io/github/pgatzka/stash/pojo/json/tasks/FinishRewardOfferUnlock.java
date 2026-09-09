package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record FinishRewardOfferUnlock(
        @JsonProperty(value = "attributes", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] attributes,
        @JsonProperty(value = "contains", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull OfferUnlockContain @NonNull [] contains,
        @JsonProperty(value = "count", required = true) @JsonSetter(nulls = Nulls.FAIL) int count,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "item", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String item,
        @JsonProperty(value = "level", required = true) @JsonSetter(nulls = Nulls.FAIL) int level,
        @JsonProperty(value = "trader", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String trader
) {
}
