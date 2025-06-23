package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface HideAdditionalTooltipComponent extends DataComponent {

    static HideAdditionalTooltipComponent create() {
        return Protocolize.getService(Factory.class).create();
    }

    interface Factory {

        HideAdditionalTooltipComponent create();

    }

}
