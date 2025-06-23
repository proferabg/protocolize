package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface MaxDamageComponent extends DataComponent {

    int getMaxDamage();

    void setMaxDamage(int maxDamage);

    static MaxDamageComponent create(int maxDamage) {
        return Protocolize.getService(Factory.class).create(maxDamage);
    }

    interface Factory {
        MaxDamageComponent create(int maxDamage);
    }

}
