package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import net.querz.nbt.tag.CompoundTag;

public interface LockComponent extends DataComponent {

    @Deprecated
    String getKey();

    @Deprecated
    void setKey(String key);

    CompoundTag getData();

    void setData(CompoundTag data);

    @Deprecated
    static LockComponent create(String key) {
        return Protocolize.getService(Factory.class).create(key);
    }

    static LockComponent create(CompoundTag data) {
        return Protocolize.getService(Factory.class).create(data);
    }

    interface Factory {

        @Deprecated
        LockComponent create(String lock);

        LockComponent create(CompoundTag data);

    }

}
