package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

import java.util.List;

public interface TooltipDisplayComponent extends DataComponent {

    boolean isHideTooltip();

    void setHideTooltip(boolean hideTooltip);

    List<DataComponentType<?>> getHiddenComponents();

    void setHiddenComponents(List<DataComponentType<?>> hiddenComponents);

    void addHiddenComponent(DataComponentType<?> hiddenComponent);

    void removeHiddenComponent(DataComponentType<?> hiddenComponent);

    void clearHiddenComponents();

    static TooltipDisplayComponent create(boolean hideTooltip, List<DataComponentType<?>> hiddenComponents) {
        return Protocolize.getService(Factory.class).create(hideTooltip, hiddenComponents);
    }

    interface Factory {

        TooltipDisplayComponent create(boolean hideTooltip, List<DataComponentType<?>> hiddenComponents);

    }

}
