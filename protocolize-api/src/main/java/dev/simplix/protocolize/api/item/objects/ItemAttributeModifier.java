package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.item.enums.EquipmentSlotGroup;
import dev.simplix.protocolize.data.Attribute;
import lombok.AllArgsConstructor;
import lombok.Data;
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

}
