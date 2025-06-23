package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface GliderComponent extends DataComponent {

    static GliderComponent create() {
        return Protocolize.getService(Factory.class).create();
    }

    interface Factory {

        GliderComponent create();

    }

}
