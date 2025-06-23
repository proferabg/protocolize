package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.EnchantmentHolder;
import dev.simplix.protocolize.data.Enchantment;

import java.util.Map;

public interface EnchantmentsComponent extends DataComponent {

    Map<EnchantmentHolder<Integer>, Integer> getEnchantments();

    void setEnchantments(Map<EnchantmentHolder<Integer>, Integer> enchantments);

    void removeEnchantment(Enchantment enchantment);

    void removeEnchantment(int enchantmentId);

    void addEnchantment(Enchantment enchantment, int level);

    void addEnchantment(int enchantmentId, int level);

    void setShowInTooltip(boolean show);

    void removeAllEnchantments();

    static EnchantmentsComponent create(Map<EnchantmentHolder<Integer>, Integer> enchantments) {
        return Protocolize.getService(Factory.class).create(enchantments);
    }

    static EnchantmentsComponent create(Map<EnchantmentHolder<Integer>, Integer> enchantments, boolean showInTooltip) {
        return Protocolize.getService(Factory.class).create(enchantments, showInTooltip);
    }

    interface Factory {

        EnchantmentsComponent create(Map<EnchantmentHolder<Integer>, Integer> enchantments);

        EnchantmentsComponent create(Map<EnchantmentHolder<Integer>, Integer> enchantments, boolean showInTooltip);

    }

}
