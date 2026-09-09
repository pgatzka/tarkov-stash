package io.github.pgatzka.stash.pojo.json.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record Lock(
        @JsonProperty(value = "bottom") @Nullable Double bottom,
        @JsonProperty(value = "id", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String id,
        @JsonProperty(value = "key", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String key,
        @JsonProperty(value = "lockType", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String lockType,
        @JsonProperty(value = "needsPower", required = true) @JsonSetter(nulls = Nulls.FAIL) boolean needsPower,
        @JsonProperty(value = "outline") @NonNull LockOutline @Nullable [] outline,
        @JsonProperty(value = "position", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull LockPosition position,
        @JsonProperty(value = "size") @Nullable LockSize size,
        @JsonProperty(value = "top") @Nullable Double top
) {
}
