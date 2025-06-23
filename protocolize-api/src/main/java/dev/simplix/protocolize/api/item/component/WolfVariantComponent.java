package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.WolfVariant;

public interface WolfVariantComponent extends DataComponent {

    WolfVariant getVariant();

    void setVariant(WolfVariant variant);

    static WolfVariantComponent create(WolfVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        WolfVariantComponent create(WolfVariant variant);

    }

}
