package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.data.Block;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToolRule {
    HolderSet<Block> blockSet;
    Float speed;
    Boolean correctToolForDrops;
}
