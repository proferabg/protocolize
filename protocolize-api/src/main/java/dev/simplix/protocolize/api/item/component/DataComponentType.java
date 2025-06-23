package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.mapping.ProtocolIdMapping;
import dev.simplix.protocolize.api.util.ProtocolUtil;

import java.util.List;

public interface DataComponentType<T extends DataComponent> {

    String getName();

    default dev.simplix.protocolize.data.DataComponentType getDataComponentType() {
        return dev.simplix.protocolize.data.DataComponentType.valueOf(ProtocolUtil.removeNamespace(getName().toUpperCase()));
    }

    default List<ProtocolIdMapping> getMappings() {
        return Protocolize.mappingProvider().mappings(getDataComponentType());
    }

    T createEmpty();

}
