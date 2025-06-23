package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.PigVariant;

public interface PigVariantComponent extends DataComponent {

    PigVariant getVariant();

    void setVariant(PigVariant variant);

    static PigVariantComponent create(PigVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        PigVariantComponent create(PigVariant variant);

    }

}
