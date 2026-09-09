package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Extract(
        @JsonProperty(value = "bottom", required = true) @JsonSetter(nulls = Nulls.FAIL) double bottom,
        @JsonProperty(value = "faction") @Nullable String faction,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "name", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String name,
        @JsonProperty(value = "outline", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ExtractOutline @NonNull [] outline,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull ExtractPosition position,
        @JsonProperty(value = "size") @Nullable ExtractSize size,
        @JsonProperty(value = "switch", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String switch_,
        @JsonProperty(value = "switches", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] switches,
        @JsonProperty(value = "top", required = true) @JsonSetter(nulls = Nulls.FAIL) double top,
        @JsonProperty(value = "transferItem") @Nullable TransferItem transferItem
) {
}
