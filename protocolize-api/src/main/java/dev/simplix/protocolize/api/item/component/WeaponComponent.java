package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface WeaponComponent extends DataComponent {

    int getItemDamagePerAttack();

    void setItemDamagePerAttack(int damagePerAttack);

    float getDisableBlockingForSeconds();

    void setDisableBlockingForSeconds(float disableBlockingForSeconds);

    static WeaponComponent create(int damagePerAttack, float disableBlockingForSeconds) {
        return Protocolize.getService(Factory.class).create(damagePerAttack, disableBlockingForSeconds);
    }

    interface Factory {

        WeaponComponent create(int damagePerAttack, float disableBlockingForSeconds);

    }

}
