package io.github.pgatzka.stash.pojo.json.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import java.util.Map;
import org.jspecify.annotations.NonNull;

public record Data(
        @JsonProperty(value = "armorMaterials", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull ArmorMaterial> armorMaterials,
        @JsonProperty(value = "fleaMarket", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull FleaMarket fleaMarket,
        @JsonProperty(value = "handbookCategories", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull HandbookCategory> handbookCategories,
        @JsonProperty(value = "itemCategories", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull ItemCategory> itemCategories,
        @JsonProperty(value = "items", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Map<String, @NonNull Item> items,
        @JsonProperty(value = "mastering", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Mastering @NonNull [] mastering,
        @JsonProperty(value = "playerLevels", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull PlayerLevel @NonNull [] playerLevels,
        @JsonProperty(value = "settings", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Settings settings,
        @JsonProperty(value = "skills", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull Skill @NonNull [] skills,
        @JsonProperty(value = "specialItems", required = true) @JsonSetter(nulls = Nulls.FAIL) @NonNull String @NonNull [] specialItems
) {
}
