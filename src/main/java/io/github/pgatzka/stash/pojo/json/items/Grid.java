package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Grid(
        @JsonProperty(value = "filters", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull GridFilters filters,
        @JsonProperty(value = "height", required = true) @JsonSetter(nulls = Nulls.FAIL) int height,
        @JsonProperty(value = "width", required = true) @JsonSetter(nulls = Nulls.FAIL) int width
) {
}
