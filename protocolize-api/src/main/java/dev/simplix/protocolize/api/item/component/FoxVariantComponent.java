package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.FoxVariant;

public interface FoxVariantComponent extends DataComponent {

    FoxVariant getVariant();

    void setVariant(FoxVariant variant);

    static FoxVariantComponent create(FoxVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        FoxVariantComponent create(FoxVariant variant);

    }

}
