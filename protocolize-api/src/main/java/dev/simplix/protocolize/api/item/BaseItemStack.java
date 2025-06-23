package dev.simplix.protocolize.api.item;

import dev.simplix.protocolize.api.chat.ChatElement;
import dev.simplix.protocolize.api.item.component.DataComponent;
import dev.simplix.protocolize.api.item.component.DataComponentType;
import dev.simplix.protocolize.api.item.enums.ItemFlag;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface BaseItemStack {
    boolean flagSet(ItemFlag flag);

    void itemFlag(ItemFlag flag, boolean active);

    Set<ItemFlag> itemFlags();

    boolean canBeStacked(BaseItemStack stack);

    ChatElement<?> displayName();

    BaseItemStack displayName(ChatElement<?> displayName);

    <T> List<ChatElement<?>> lore();

    void lore(List<ChatElement<?>> list);

    void lore(int index, ChatElement<?> element);

    void addToLore(ChatElement<?> element);

    BaseItemStack deepClone();

    BaseItemStack deepClone(int protocolVersion);

    dev.simplix.protocolize.data.ItemType itemType();

    @Deprecated
    net.querz.nbt.tag.CompoundTag nbtData();

    byte amount();

    short durability();

    int hideFlags();

    Collection<DataComponent> getComponents();

    Collection<DataComponentType<?>> getComponentsToRemove();

    <T extends DataComponent> T getComponent(Class<? extends DataComponent> type);

    BaseItemStack addComponent(DataComponent component);

    BaseItemStack removeComponent(DataComponentType<?> type);

    BaseItemStack itemType(dev.simplix.protocolize.data.ItemType itemType);

    @Deprecated
    BaseItemStack nbtData(net.querz.nbt.tag.CompoundTag nbtData);

    BaseItemStack amount(byte amount);

    BaseItemStack durability(short durability);

    BaseItemStack hideFlags(int hideFlags);
}
