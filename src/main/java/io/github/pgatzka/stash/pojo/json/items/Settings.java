package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public record Settings(
        @JsonProperty(value = "globalMaxTraders", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean globalMaxTraders,
        @JsonProperty(value = "gpCoinValue", required = true) @JsonSetter(nulls = Nulls.FAIL) int gpCoinValue,
        @JsonProperty(value = "scavCooldownSeconds", required = true) @JsonSetter(nulls = Nulls.FAIL) int scavCooldownSeconds
) {
}
