package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface PotionDurationScaleComponent extends DataComponent {

    float getScale();

    void setScale(float scale);

    static PotionDurationScaleComponent create(float scale) {
        return Protocolize.getService(Factory.class).create(scale);
    }

    interface Factory {

        PotionDurationScaleComponent create(float scale);

    }

}
