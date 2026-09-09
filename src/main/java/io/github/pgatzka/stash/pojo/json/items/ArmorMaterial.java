package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record ArmorMaterial(
        @JsonProperty(value = "destructibility", required = true) @JsonSetter(nulls = Nulls.FAIL) double destructibility,
        @JsonProperty(value = "explosionDestructibility", required = true) @JsonSetter(nulls = Nulls.FAIL) double explosionDestructibility,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "maxRepairDegradation", required = true) @JsonSetter(nulls = Nulls.FAIL) double maxRepairDegradation,
        @JsonProperty(value = "maxRepairKitDegradation", required = true) @JsonSetter(nulls = Nulls.FAIL) double maxRepairKitDegradation,
        @JsonProperty(value = "minRepairDegradation", required = true) @JsonSetter(nulls = Nulls.FAIL) double minRepairDegradation,
        @JsonProperty(value = "minRepairKitDegradation", required = true) @JsonSetter(nulls = Nulls.FAIL) double minRepairKitDegradation,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name
) {
}
