package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import net.querz.nbt.tag.CompoundTag;

public interface BucketEntityDataComponent extends DataComponent {

    CompoundTag getData();

    void setData(CompoundTag data);

    static BucketEntityDataComponent create(CompoundTag data) {
        return Protocolize.getService(Factory.class).create(data);
    }

    interface Factory {

        BucketEntityDataComponent create(CompoundTag data);

    }

}
