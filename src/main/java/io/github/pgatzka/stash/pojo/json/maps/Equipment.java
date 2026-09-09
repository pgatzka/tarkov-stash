package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Equipment(
        @JsonProperty(value = "attributes", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull EquipmentAttributes attributes,
        @JsonProperty(value = "contains", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Contain @NonNull [] contains,
        @JsonProperty(value = "count", required = true) @JsonSetter(nulls = Nulls.FAIL) int count,
        @JsonProperty(value = "item", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String item
) {
}
