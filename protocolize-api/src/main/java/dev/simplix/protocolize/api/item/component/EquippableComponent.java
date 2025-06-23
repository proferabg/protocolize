package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.enums.EquipmentSlot;
import dev.simplix.protocolize.api.item.objects.SoundEvent;
import dev.simplix.protocolize.api.item.objects.HolderSet;
import dev.simplix.protocolize.data.EntityType;

public interface EquippableComponent extends DataComponent {

    EquipmentSlot getSlot();

    void setSlot(EquipmentSlot slot);

    SoundEvent getEquipSound();

    void setEquipSound(SoundEvent equipSound);

    String getModel();

    void setModel(String model);

    String getCameraOverlay();

    void setCameraOverlay(String cameraOverlay);

    HolderSet<EntityType> getAllowedEntities();

    void setAllowedEntities(HolderSet<EntityType> allowedEntities);

    boolean isDispensable();

    void setDispensable(boolean dispensable);

    boolean isSwappable();

    void setSwappable(boolean swappable);

    boolean isDamageOnHurt();

    void setDamageOnHurt(boolean damageOnHurt);

    boolean isEquipOnInteract();

    void setEquipOnInteract(boolean equipOnInteract);

    boolean isCanBeSheared();

    void setCanBeSheared(boolean canBeSheared);

    SoundEvent getShearingSound();

    void setShearingSound(SoundEvent shearingSound);

    static EquippableComponent create(EquipmentSlot equipmentSlot, SoundEvent equipSound, String model, String cameraOverlay, HolderSet<EntityType> allowedEntities, boolean dispensable, boolean swappable, boolean damageOnHurt, boolean equipOnInteract, boolean  canBeSheared, SoundEvent shearingSound) {
        return Protocolize.getService(EquippableComponent.Factory.class).create(equipmentSlot, equipSound, model, cameraOverlay, allowedEntities, dispensable, swappable, damageOnHurt, equipOnInteract, canBeSheared, shearingSound);
    }

    interface Factory {

        EquippableComponent create(EquipmentSlot equipmentSlot, SoundEvent equipSound, String model, String cameraOverlay, HolderSet<EntityType> allowedEntities, boolean dispensable, boolean swappable, boolean damageOnHurt, boolean equipOnInteract, boolean  canBeSheared, SoundEvent shearingSound);

    }
}
