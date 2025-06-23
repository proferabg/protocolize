package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.VillagerType;

public interface VillagerVariantComponent extends DataComponent {

    VillagerType getVillagerType();

    void setVillagerType(VillagerType type);

    static VillagerVariantComponent create(VillagerType type) {
        return Protocolize.getService(Factory.class).create(type);
    }

    interface Factory {

        VillagerVariantComponent create(VillagerType type);

    }

}
