package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.BannerPatternLayer;

import java.util.List;

public interface BannerPatternsComponent extends DataComponent {

    List<BannerPatternLayer> getLayers();

    void setLayers(List<BannerPatternLayer> layers);

    void addLayer(BannerPatternLayer layer);

    void removeLayer(BannerPatternLayer layer);

    void removeAllLayers();

    static BannerPatternsComponent create(List<BannerPatternLayer> layers) {
        return Protocolize.getService(BannerPatternsComponent.Factory.class).create(layers);
    }

    interface Factory {

        BannerPatternsComponent create(List<BannerPatternLayer> layers);

    }

}
