package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record DataQuestItems2(
        @JsonProperty(value = "baseImageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String baseImageLink,
        @JsonProperty(value = "description", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String description,
        @JsonProperty(value = "gridImageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String gridImageLink,
        @JsonProperty(value = "height", required = true) @JsonSetter(nulls = Nulls.FAIL) int height,
        @JsonProperty(value = "iconLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String iconLink,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "image512pxLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String image512pxLink,
        @JsonProperty(value = "image8xLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String image8xLink,
        @JsonProperty(value = "inspectImageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String inspectImageLink,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "normalizedName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String normalizedName,
        @JsonProperty(value = "shortName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String shortName,
        @JsonProperty(value = "width", required = true) @JsonSetter(nulls = Nulls.FAIL) int width
) {
}
