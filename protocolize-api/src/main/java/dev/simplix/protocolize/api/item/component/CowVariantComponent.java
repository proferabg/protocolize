package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.CowVariant;

public interface CowVariantComponent extends DataComponent {

    CowVariant getVariant();

    void setVariant(CowVariant variant);

    static CowVariantComponent create(CowVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        CowVariantComponent create(CowVariant variant);

    }

}
