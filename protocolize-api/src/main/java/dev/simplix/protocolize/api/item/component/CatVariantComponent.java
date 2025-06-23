package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.CatVariant;

public interface CatVariantComponent extends DataComponent {

    CatVariant getVariant();

    void setVariant(CatVariant variant);

    static CatVariantComponent create(CatVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        CatVariantComponent create(CatVariant variant);

    }

}
