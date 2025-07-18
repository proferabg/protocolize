package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.ConsumeEffect;
import dev.simplix.protocolize.api.item.enums.ItemUseAnimation;
import dev.simplix.protocolize.api.item.objects.SoundEvent;

import java.util.List;

public interface ConsumableComponent extends DataComponent {

    float getConsumeSeconds();

    void setConsumeSeconds(float consumeSeconds);

    ItemUseAnimation getAnimation();

    void setAnimation(ItemUseAnimation animation);

    SoundEvent getSound();

    void setSound(SoundEvent sound);

    boolean isHasParticles();

    void setHasParticles(boolean hasParticles);

    List<ConsumeEffect.ConsumeEffectInstance> getConsumeEffects();

    void setConsumeEffects(List<ConsumeEffect.ConsumeEffectInstance> consumeEffects);

    static ConsumableComponent create(float consumeSeconds, ItemUseAnimation animation, SoundEvent sound, boolean hasParticles, List<ConsumeEffect.ConsumeEffectInstance> consumeEffects) {
        return Protocolize.getService(ConsumableComponent.Factory.class).create(consumeSeconds, animation, sound, hasParticles, consumeEffects);
    }

    interface Factory {

        ConsumableComponent create(float consumeSeconds, ItemUseAnimation animation, SoundEvent sound, boolean hasParticles, List<ConsumeEffect.ConsumeEffectInstance> consumeEffects);

    }
}
