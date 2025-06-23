package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.ChickenVariant;

public interface ChickenVariantComponent extends DataComponent {

    String getRegistryKey();

    void setRegistryKey(String registryKey);

    ChickenVariant getVariant();

    void setVariant(ChickenVariant variant);

    static ChickenVariantComponent create(String registryKey) {
        return Protocolize.getService(Factory.class).create(registryKey);
    }
    static ChickenVariantComponent create(ChickenVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        ChickenVariantComponent create(String registryKey);
        ChickenVariantComponent create(ChickenVariant variant);

    }

}
