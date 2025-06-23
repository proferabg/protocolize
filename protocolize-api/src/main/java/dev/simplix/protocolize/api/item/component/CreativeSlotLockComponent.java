package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface CreativeSlotLockComponent extends DataComponent {

    static CreativeSlotLockComponent create() {
        return Protocolize.getService(Factory.class).create();
    }

    interface Factory {

        CreativeSlotLockComponent create();

    }

}
