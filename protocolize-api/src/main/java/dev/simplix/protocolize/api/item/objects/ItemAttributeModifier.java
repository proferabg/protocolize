package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.chat.ChatElement;
import dev.simplix.protocolize.api.item.enums.EquipmentSlotGroup;
import dev.simplix.protocolize.data.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemAttributeModifier {

    private HolderSet<Attribute> type;
    private UUID uuid;
    private AttributeModifier modifier;
    private EquipmentSlotGroup slot;
    private Display display;


    public abstract static class Display {

        public int getId() {
            return 0;
        }

        public static class Default extends Display { }

        public static class Hidden extends Display {
            @java.lang.Override
            public int getId() {
                return 1;
            }
        }

        @Data
        @AllArgsConstructor
        @EqualsAndHashCode(callSuper = false)
        public static class Override extends Display {
            ChatElement<?> text;

            @java.lang.Override
            public int getId() {
                return 2;
            }

        }
    }

}
