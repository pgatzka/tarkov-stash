package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record HandbookCategory(
        @JsonProperty(value = "children", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] children,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "imageLink") @Nullable String imageLink,
        @JsonProperty(value = "minLevelForFlea") @Nullable Integer minLevelForFlea,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName,
        @JsonProperty(value = "parent") @Nullable String parent
) {
}
