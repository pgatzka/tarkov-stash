package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record DataItemCategories2(
        @JsonProperty(value = "children", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] children,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName,
        @JsonProperty(value = "parent", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String parent
) {
}
