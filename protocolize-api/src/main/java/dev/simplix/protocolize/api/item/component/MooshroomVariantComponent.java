package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.MooshroomVariant;

public interface MooshroomVariantComponent extends DataComponent {

    MooshroomVariant getVariant();

    void setVariant(MooshroomVariant variant);

    static MooshroomVariantComponent create(MooshroomVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        MooshroomVariantComponent create(MooshroomVariant variant);

    }

}
