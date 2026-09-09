package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Condition(
        @JsonProperty(value = "count") @Nullable Integer count,
        @JsonProperty(value = "description", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String description,
        @JsonProperty(value = "dogTagLevel") @Nullable Integer dogTagLevel,
        @JsonProperty(value = "foundInRaid") @Nullable Boolean foundInRaid,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "items") @NonNull String @Nullable [] items,
        @JsonProperty(value = "level") @Nullable Integer level,
        @JsonProperty(value = "maps", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Object @NonNull [] maps,
        @JsonProperty(value = "maxDurability") @Nullable Integer maxDurability,
        @JsonProperty(value = "minDurability") @Nullable Integer minDurability,
        @JsonProperty(value = "optional", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean optional,
        @JsonProperty(value = "playerLevel") @Nullable Integer playerLevel,
        @JsonProperty(value = "skill") @Nullable String skill,
        @JsonProperty(value = "station") @Nullable String station,
        @JsonProperty(value = "stationLevel") @Nullable Integer stationLevel,
        @JsonProperty(value = "status") @NonNull String @Nullable [] status,
        @JsonProperty(value = "task") @Nullable String task,
        @JsonProperty(value = "type", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String type
) {
}
