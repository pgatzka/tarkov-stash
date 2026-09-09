package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.NonNull;

public record Data(
        @JsonProperty(value = "armorMaterials", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataArmorMaterials armorMaterials,
        @JsonProperty(value = "armorMaterials{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataArmorMaterials2 armorMaterials__,
        @JsonProperty(value = "fleaMarket", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FleaMarket fleaMarket,
        @JsonProperty(value = "handbookCategories", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataHandbookCategories handbookCategories,
        @JsonProperty(value = "handbookCategories{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataHandbookCategories2 handbookCategories__,
        @JsonProperty(value = "itemCategories", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataItemCategories itemCategories,
        @JsonProperty(value = "itemCategories{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataItemCategories2 itemCategories__,
        @JsonProperty(value = "items", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataItems items,
        @JsonProperty(value = "items{}", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull DataItems2 items__,
        @JsonProperty(value = "mastering", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Mastering @NonNull [] mastering,
        @JsonProperty(value = "playerLevels", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull PlayerLevel @NonNull [] playerLevels,
        @JsonProperty(value = "settings", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Settings settings,
        @JsonProperty(value = "skills", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Skill @NonNull [] skills,
        @JsonProperty(value = "specialItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] specialItems
) {
}
