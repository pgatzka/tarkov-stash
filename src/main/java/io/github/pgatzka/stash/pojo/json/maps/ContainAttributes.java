package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record ContainAttributes(
        @JsonProperty(value = "parentItemId", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String parentItemId,
        @JsonProperty(value = "slotNameId", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String slotNameId
) {
}
