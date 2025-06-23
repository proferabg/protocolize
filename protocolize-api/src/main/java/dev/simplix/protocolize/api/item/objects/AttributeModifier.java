package dev.simplix.protocolize.api.item.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttributeModifier {

    private String id;
    private MinMaxBounds<Double> amount;
    private Operation operation;

    /* These may change in the future */
    public enum Operation {
        ADD_VALUE,
        ADD_MULTIPLIED_BASE,
        ADD_MULTIPLIED_TOTAL
    }

}
