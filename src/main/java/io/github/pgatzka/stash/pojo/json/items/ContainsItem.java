package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record ContainsItem(
        @JsonProperty(value = "attributes", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Attributes attributes,
        @JsonProperty(value = "count", required = true) @JsonSetter(nulls = Nulls.FAIL) int count,
        @JsonProperty(value = "item", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String item
) {
}
