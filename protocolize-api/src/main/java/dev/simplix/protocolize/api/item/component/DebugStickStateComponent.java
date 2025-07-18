package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import net.querz.nbt.tag.CompoundTag;

public interface DebugStickStateComponent extends DataComponent {

    CompoundTag getData();

    void setData(CompoundTag data);

    static DebugStickStateComponent create(CompoundTag data) {
        return Protocolize.getService(Factory.class).create(data);
    }

    interface Factory {

        DebugStickStateComponent create(CompoundTag data);

    }

}
