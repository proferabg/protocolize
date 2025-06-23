package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.WolfSoundVariant;

public interface WolfSoundVariantComponent extends DataComponent {

    WolfSoundVariant getVariant();

    void setVariant(WolfSoundVariant variant);

    static WolfSoundVariantComponent create(WolfSoundVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        WolfSoundVariantComponent create(WolfSoundVariant variant);

    }

}
