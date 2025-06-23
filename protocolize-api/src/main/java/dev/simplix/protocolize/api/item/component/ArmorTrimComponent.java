package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.DirectTrimMaterial;
import dev.simplix.protocolize.api.item.objects.DirectTrimPattern;
import dev.simplix.protocolize.api.item.objects.Holder;
import dev.simplix.protocolize.data.TrimMaterial;
import dev.simplix.protocolize.data.TrimPattern;

public interface ArmorTrimComponent extends DataComponent {

    Holder<TrimMaterial, DirectTrimMaterial> getTrimMaterial();

    void setTrimMaterial(Holder<TrimMaterial, DirectTrimMaterial> trim);

    Holder<TrimPattern, DirectTrimPattern> getTrimPattern();

    void setTrimPattern(Holder<TrimPattern, DirectTrimPattern> trim);

    @Deprecated
    boolean isShowInTooltip();

    @Deprecated
    void setShowInTooltip(boolean showInTooltip);

    @Deprecated
    static ArmorTrimComponent create(Holder<TrimMaterial, DirectTrimMaterial> trimMaterial, Holder<TrimPattern, DirectTrimPattern> trimPattern, boolean showInTooltip) {
        return Protocolize.getService(Factory.class).create(trimMaterial, trimPattern, showInTooltip);
    }

    static ArmorTrimComponent create(Holder<TrimMaterial, DirectTrimMaterial> trimMaterial, Holder<TrimPattern, DirectTrimPattern> trimPattern) {
        return Protocolize.getService(Factory.class).create(trimMaterial, trimPattern, false);
    }

    interface Factory {

        @Deprecated
        ArmorTrimComponent create(Holder<TrimMaterial, DirectTrimMaterial> trimMaterial, Holder<TrimPattern, DirectTrimPattern> trimPattern, boolean showInTooltip);

        ArmorTrimComponent create(Holder<TrimMaterial, DirectTrimMaterial> trimMaterial, Holder<TrimPattern, DirectTrimPattern> trimPattern);

    }

}
