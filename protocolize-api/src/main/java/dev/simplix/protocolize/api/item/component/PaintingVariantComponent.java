package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.PaintingVariant;

public interface PaintingVariantComponent extends DataComponent {

    PaintingVariant getVariant();

    void setVariant(PaintingVariant variant);

    static PaintingVariantComponent create(PaintingVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        PaintingVariantComponent create(PaintingVariant variant);

    }

}
