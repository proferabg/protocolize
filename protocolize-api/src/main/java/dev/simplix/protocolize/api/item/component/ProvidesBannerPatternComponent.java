package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface ProvidesBannerPatternComponent extends DataComponent {

    String getRegistryKey();

    void setRegistryKey(String registryKey);

    static ProvidesBannerPatternComponent create(String registryKey) {
        return Protocolize.getService(Factory.class).create(registryKey);
    }

    interface Factory {

        ProvidesBannerPatternComponent create(String registryKey);

    }

}
