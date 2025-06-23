package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.ItemAttributeModifier;

import java.util.List;

public interface AttributeModifiersComponent extends DataComponent {

    List<ItemAttributeModifier> getAttributeModifiers();

    void setAttributeModifiers(List<ItemAttributeModifier> attributeModifiers);

    boolean isShowInTooltip();

    void setShowInTooltip(boolean showInTooltip);

    void addAttribute(ItemAttributeModifier attributeModifier);

    void removeAttribute(ItemAttributeModifier attributeModifier);

    void removeAllAttributes();

    static AttributeModifiersComponent create(List<ItemAttributeModifier> attributeModifiers) {
        return Protocolize.getService(Factory.class).create(attributeModifiers);
    }

    static AttributeModifiersComponent create(List<ItemAttributeModifier> attributeModifiers, boolean showInTooltip) {
        return Protocolize.getService(Factory.class).create(attributeModifiers, showInTooltip);
    }

    interface Factory {

        AttributeModifiersComponent create(List<ItemAttributeModifier> attributeModifiers);
        AttributeModifiersComponent create(List<ItemAttributeModifier> attributeModifiers, boolean showInTooltip);

    }

}
