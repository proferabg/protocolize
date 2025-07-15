package dev.simplix.protocolize.api.item;

import dev.simplix.protocolize.data.DataComponentType;
import dev.simplix.protocolize.data.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Data
@AllArgsConstructor
public class HashedStack {

    private Optional<ActualItem> item;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ActualItem {
        private ItemType type;
        private int count;
        private HashedPatchMap components;
    }

    @Data
    @AllArgsConstructor
    public static class HashedPatchMap {
        private Map<DataComponentType, Integer> addedComponents;
        private Set<DataComponentType> removedComponents;
    }

}
