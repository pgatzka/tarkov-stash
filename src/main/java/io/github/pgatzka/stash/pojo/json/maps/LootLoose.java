package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record LootLoose(
        @JsonProperty(value = "items", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] items,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull LootLoosePosition position
) {
}
