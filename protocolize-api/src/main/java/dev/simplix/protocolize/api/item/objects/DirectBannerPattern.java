package dev.simplix.protocolize.api.item.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectBannerPattern {
    private String assetId;
    private String translationKey;
}
