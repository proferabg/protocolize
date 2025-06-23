package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.SalmonVariant;

public interface SalmonSizeComponent extends DataComponent {

    SalmonVariant getVariant();

    void setVariant(SalmonVariant variant);

    static SalmonSizeComponent create(SalmonVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        SalmonSizeComponent create(SalmonVariant variant);

    }

}
