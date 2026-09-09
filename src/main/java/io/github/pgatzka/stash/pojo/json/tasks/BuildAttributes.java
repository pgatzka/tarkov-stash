package io.github.pgatzka.stash.pojo.json.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record BuildAttributes(
        @JsonProperty(value = "accuracy", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Accuracy accuracy,
        @JsonProperty(value = "durability", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Durability durability,
        @JsonProperty(value = "effectiveDistance", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull EffectiveDistance effectiveDistance,
        @JsonProperty(value = "ergonomics", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Ergonomics ergonomics,
        @JsonProperty(value = "height", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Height height,
        @JsonProperty(value = "magazineCapacity", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull MagazineCapacity magazineCapacity,
        @JsonProperty(value = "muzzleVelocity", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull MuzzleVelocity muzzleVelocity,
        @JsonProperty(value = "recoil", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Recoil recoil,
        @JsonProperty(value = "weight", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Weight weight,
        @JsonProperty(value = "width", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Width width
) {
}
