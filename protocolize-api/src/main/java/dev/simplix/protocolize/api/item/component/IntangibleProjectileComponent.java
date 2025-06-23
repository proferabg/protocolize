package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface IntangibleProjectileComponent extends DataComponent {

    static IntangibleProjectileComponent create() {
        return Protocolize.getService(Factory.class).create();
    }

    interface Factory {

        IntangibleProjectileComponent create();

    }

}
