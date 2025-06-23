package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.data.LlamaVariant;

public interface LlamaVariantComponent extends DataComponent {

    LlamaVariant getVariant();

    void setVariant(LlamaVariant variant);

    static LlamaVariantComponent create(LlamaVariant variant) {
        return Protocolize.getService(Factory.class).create(variant);
    }

    interface Factory {

        LlamaVariantComponent create(LlamaVariant variant);

    }

}
