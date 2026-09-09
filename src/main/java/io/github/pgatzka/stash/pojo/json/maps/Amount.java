package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public record Amount(
        @JsonProperty(value = "chance", required = true) @JsonSetter(nulls = Nulls.FAIL) double chance,
        @JsonProperty(value = "count", required = true) @JsonSetter(nulls = Nulls.FAIL) int count
) {
}
