package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.item.enums.DyeColor;
import dev.simplix.protocolize.data.BannerPattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BannerPatternLayer {
    private Holder<BannerPattern, DirectBannerPattern> pattern;
    private DyeColor color;
}
