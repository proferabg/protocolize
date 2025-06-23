package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.AxolotlVariant;

public interface AxolotlVariantComponent extends DataComponent {

    AxolotlVariant getVariant();

    void setVariant(AxolotlVariant variant);

    static AxolotlVariantComponent create(AxolotlVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        AxolotlVariantComponent create(AxolotlVariant variant);

    }

}
