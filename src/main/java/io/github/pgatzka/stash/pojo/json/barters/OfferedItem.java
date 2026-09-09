package io.github.pgatzka.stash.pojo.json.barters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record OfferedItem(
        @JsonProperty(value = "attributes", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull OfferedItemAttributes attributes,
        @JsonProperty(value = "baseId") @Nullable String baseId,
        @JsonProperty(value = "count", required = true) @JsonSetter(nulls = Nulls.FAIL) int count,
        @JsonProperty(value = "item", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String item
) {
}
