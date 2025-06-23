package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.SoundEvent;

public interface BreakSoundComponent extends DataComponent {

    SoundEvent getSound();

    void setSound(SoundEvent sound);

    static BreakSoundComponent create(SoundEvent sound) {
        return Protocolize.getService(Factory.class).create(sound);
    }

    interface Factory {

        BreakSoundComponent create(SoundEvent sound);

    }

}
