package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.RabbitVariant;

public interface RabbitVariantComponent extends DataComponent {

    RabbitVariant getVariant();

    void setVariant(RabbitVariant variant);

    static RabbitVariantComponent create(RabbitVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        RabbitVariantComponent create(RabbitVariant variant);

    }

}
