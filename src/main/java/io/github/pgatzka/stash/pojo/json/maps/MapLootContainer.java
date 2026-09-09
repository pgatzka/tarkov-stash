package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record MapLootContainer(
        @JsonProperty(value = "lootContainer", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String lootContainer,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull LootContainerPosition position
) {
}
