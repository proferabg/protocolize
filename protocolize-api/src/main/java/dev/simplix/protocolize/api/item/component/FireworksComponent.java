package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.Firework;

public interface FireworksComponent extends DataComponent {

    Firework getFirework();

    void setFirework(Firework firework);

    static FireworksComponent create(Firework firework) {
        return Protocolize.getService(Factory.class).create(firework);
    }

    interface Factory {

        FireworksComponent create(Firework firework);

    }

}
