package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.DirectTrimMaterial;
import dev.simplix.protocolize.api.item.objects.Holder;
import dev.simplix.protocolize.data.TrimMaterial;

public interface ProvidesTrimMaterialComponent extends DataComponent {

    Holder<TrimMaterial, DirectTrimMaterial> getMaterial();

    void setMaterial(Holder<TrimMaterial, DirectTrimMaterial> material);

    void setMaterial(DirectTrimMaterial material);

    void setMaterial(TrimMaterial material);

    static ProvidesTrimMaterialComponent create(Holder<TrimMaterial, DirectTrimMaterial> material) {
        return Protocolize.getService(Factory.class).create(material);
    }

    static ProvidesTrimMaterialComponent create(DirectTrimMaterial material) {
        return Protocolize.getService(Factory.class).create(material);
    }

    static ProvidesTrimMaterialComponent create(TrimMaterial material) {
        return Protocolize.getService(Factory.class).create(material);
    }

    interface Factory {

        ProvidesTrimMaterialComponent create(TrimMaterial material);
        ProvidesTrimMaterialComponent create(DirectTrimMaterial material);
        ProvidesTrimMaterialComponent create(Holder<TrimMaterial, DirectTrimMaterial> material);

    }

}
