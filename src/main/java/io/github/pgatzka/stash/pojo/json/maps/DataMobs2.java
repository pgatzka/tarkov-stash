package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record DataMobs2(
        @JsonProperty(value = "equipment", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Equipment @NonNull [] equipment,
        @JsonProperty(value = "health") @NonNull Health @Nullable [] health,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "imagePortraitLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String imagePortraitLink,
        @JsonProperty(value = "imagePosterLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String imagePosterLink,
        @JsonProperty(value = "items", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Item @NonNull [] items,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName
) {
}
