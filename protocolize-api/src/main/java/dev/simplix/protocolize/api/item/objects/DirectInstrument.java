package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.chat.ChatElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectInstrument {
    private SoundEvent sound;
    private float useDuration;
    private float range;
    private ChatElement<?> description;
}
