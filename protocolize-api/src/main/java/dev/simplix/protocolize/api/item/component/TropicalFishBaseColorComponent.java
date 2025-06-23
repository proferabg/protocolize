package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.enums.DyeColor;

public interface TropicalFishBaseColorComponent extends DataComponent {

    DyeColor getColor();

    void setColor(DyeColor color);

    static TropicalFishBaseColorComponent create(DyeColor color) {
        return Protocolize.getService(Factory.class).create(color);
    }

    interface Factory {

        TropicalFishBaseColorComponent create(DyeColor color);

    }

}
