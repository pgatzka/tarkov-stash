package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Slot(
        @JsonProperty(value = "filters", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull SlotFilters filters,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "nameId", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String nameId,
        @JsonProperty(value = "required", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean required
) {
}
