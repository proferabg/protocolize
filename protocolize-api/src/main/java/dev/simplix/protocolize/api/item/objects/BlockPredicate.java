package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.data.Block;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.querz.nbt.tag.CompoundTag;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockPredicate {

    private HolderSet<Block> blockSet;
    private List<Property> properties;
    private CompoundTag nbtData;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Property {
        private String name;
        private String exactValue;
        private String minValue;
        private String maxValue;
    }

}
