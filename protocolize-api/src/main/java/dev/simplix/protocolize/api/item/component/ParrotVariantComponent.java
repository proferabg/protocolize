package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.ParrotVariant;

public interface ParrotVariantComponent extends DataComponent {

    ParrotVariant getVariant();

    void setVariant(ParrotVariant variant);

    static ParrotVariantComponent create(ParrotVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        ParrotVariantComponent create(ParrotVariant variant);

    }

}
