package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.TropicalFishPattern;

public interface TropicalFishPatternComponent extends DataComponent {

    TropicalFishPattern getPattern();

    void setPattern(TropicalFishPattern pattern);

    static TropicalFishPatternComponent create(TropicalFishPattern pattern) {
        return Protocolize.getService(Factory.class).create(pattern);
    }

    interface Factory {

        TropicalFishPatternComponent create(TropicalFishPattern pattern);

    }

}
