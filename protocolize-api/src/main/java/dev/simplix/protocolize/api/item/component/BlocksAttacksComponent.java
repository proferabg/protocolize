package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.DamageReduction;
import dev.simplix.protocolize.api.item.objects.ItemDamageFunction;
import dev.simplix.protocolize.api.item.objects.SoundEvent;

import java.util.List;

public interface BlocksAttacksComponent extends DataComponent {

    float getBlockDelaySeconds();

    void setBlockDelaySeconds(float blockDelaySeconds);

    float getDisableCooldownScale();

    void setDisableCooldownScale(float disableCooldownScale);

    List<DamageReduction> getDamageReductions();

    void setDamageReductions(List<DamageReduction> damageReductions);

    ItemDamageFunction getItemDamage();

    void setItemDamage(ItemDamageFunction itemDamage);

    String getBypassedBy();

    void setBypassedBy(String damageType);

    SoundEvent getBlockSound();

    void setBlockSound(SoundEvent blockSound);

    SoundEvent getDisableSound();

    void setDisableSound(SoundEvent disableSound);

    static BlocksAttacksComponent create(float blockDelaySeconds, float disableCooldownScale, List<DamageReduction> damageReductions, ItemDamageFunction itemDamage, String bypassedBy, SoundEvent blockSound, SoundEvent disableSound) {
        return Protocolize.getService(Factory.class).create(blockDelaySeconds, disableCooldownScale, damageReductions, itemDamage, bypassedBy, blockSound, disableSound);
    }

    interface Factory {

        BlocksAttacksComponent create(float blockDelaySeconds, float disableCooldownScale, List<DamageReduction> damageReductions, ItemDamageFunction itemDamage, String bypassedBy, SoundEvent blockSound, SoundEvent disableSound);

    }

}
