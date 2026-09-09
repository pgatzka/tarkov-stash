package io.github.pgatzka.stash.pojo.json.hideout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record HideoutData2(
        @JsonProperty(value = "areaType", required = true) @JsonSetter(nulls = Nulls.FAIL) int areaType,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "imageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String imageLink,
        @JsonProperty(value = "levels", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Level @NonNull [] levels,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName
) {
}
