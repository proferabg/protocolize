package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.HorseVariant;

public interface HorseVariantComponent extends DataComponent {

    HorseVariant getVariant();

    void setVariant(HorseVariant variant);

    static HorseVariantComponent create(HorseVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        HorseVariantComponent create(HorseVariant variant);

    }

}
