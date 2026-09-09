package io.github.pgatzka.stash.pojo.json.hideout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public record Attributes(
        @JsonProperty(value = "foundInRaid", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean foundInRaid
) {
}
