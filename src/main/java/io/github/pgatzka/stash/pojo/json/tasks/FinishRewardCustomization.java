package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record FinishRewardCustomization(
        @JsonProperty(value = "customizationType", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String customizationType,
        @JsonProperty(value = "customizationTypeName", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String customizationTypeName,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "imageLink", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String imageLink,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name
) {
}
