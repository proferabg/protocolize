package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.data.DamageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DamageReduction {
    private float horizontalBlockingAngle;
    private HolderSet<DamageType> type;
    private float base;
    private float factor;
}
