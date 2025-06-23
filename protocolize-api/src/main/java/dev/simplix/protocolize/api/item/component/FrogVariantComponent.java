package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.FrogVariant;

public interface FrogVariantComponent extends DataComponent {

    FrogVariant getVariant();

    void setVariant(FrogVariant variant);

    static FrogVariantComponent create(FrogVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        FrogVariantComponent create(FrogVariant variant);

    }

}
