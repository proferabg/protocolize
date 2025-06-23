package dev.simplix.protocolize.api.item.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialAssetGroup {
    String base;
    Map<String, String> overrides;
}
