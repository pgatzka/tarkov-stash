package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Artillery(
        @JsonProperty(value = "zones", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Zone @NonNull [] zones
) {
}
