package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.chat.ChatElement;
import dev.simplix.protocolize.data.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

public class DirectTrimPattern {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = false)
    public static class DirectTrimPattern_v766 extends DirectTrimPattern {
        private String assetId;
        private ItemType templateItem;
        private ChatElement<?> description;
        private boolean decal;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = false)
    public static class DirectTrimPattern_v770 extends DirectTrimPattern {
        private String assetId;
        private ChatElement<?> description;
        private boolean decal;
    }


}
