package dev.simplix.protocolize.api.item.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDamageFunction {
    private float threshold;
    private float base;
    private float factor;
}
