package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.chat.ChatElement;
import dev.simplix.protocolize.data.ArmorMaterial;
import dev.simplix.protocolize.data.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Map;

public class DirectTrimMaterial {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = false)
    public static class DirectTrimMaterial_v766 extends DirectTrimMaterial {
        private String assetName;
        private ItemType ingredient;
        private float itemModelIndex;
        private Map<ArmorMaterial, String> overrides;
        private ChatElement<?> description;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = false)
    public static class DirectTrimMaterial_v768 extends DirectTrimMaterial {
        private String assetName;
        private ItemType ingredient;
        private float itemModelIndex;
        private Map<String, String> overrides;
        private ChatElement<?> description;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = false)
    public static class DirectTrimMaterial_v769 extends DirectTrimMaterial {
        private String assetName;
        private ItemType ingredient;
        private Map<String, String> overrides;
        private ChatElement<?> description;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = false)
    public static class DirectTrimMaterial_v770 extends DirectTrimMaterial {
        private MaterialAssetGroup materialAssetGroup;
        private ChatElement<?> description;
    }
}
