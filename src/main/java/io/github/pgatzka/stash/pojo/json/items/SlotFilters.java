package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record SlotFilters(
        @JsonProperty(value = "allowedCategories", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] allowedCategories,
        @JsonProperty(value = "allowedItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] allowedItems,
        @JsonProperty(value = "excludedCategories", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] excludedCategories,
        @JsonProperty(value = "excludedItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] excludedItems
) {
}
