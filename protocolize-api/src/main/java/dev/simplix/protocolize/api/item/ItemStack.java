package dev.simplix.protocolize.api.item;

import dev.simplix.protocolize.api.chat.ChatElement;
import dev.simplix.protocolize.api.item.component.DataComponent;
import dev.simplix.protocolize.api.item.component.DataComponentType;
import dev.simplix.protocolize.api.item.enums.ItemFlag;
import dev.simplix.protocolize.api.util.ProtocolVersions;
import dev.simplix.protocolize.data.ItemType;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import net.querz.nbt.tag.CompoundTag;

import java.util.*;

/**
 * This class represents a Minecraft item stack. <br>
 * <br>
 * Date: 24.08.2021
 *
 * @author Exceptionflug
 */
@Slf4j(topic = "Protocolize")
@Getter
@Setter
@Accessors(fluent = true)
@EqualsAndHashCode
@ToString
public class ItemStack implements BaseItemStack {

    public static final ItemStack NO_DATA = new ItemStack((ItemType) null);

    @Getter(AccessLevel.NONE)
    private final Map<Class<? extends DataComponent>, DataComponent> componentsToAdd = new HashMap<>();
    @Getter(AccessLevel.NONE)
    private final Set<DataComponentType<?>> componentsToRemove = new HashSet<>();

    @Setter(AccessLevel.NONE)
    private ChatElement<?> displayName;
    @Setter(AccessLevel.NONE)
    private List<ChatElement<?>> lore = new ArrayList<>();
    protected ItemType itemType;
    @Deprecated
    protected CompoundTag nbtData = new CompoundTag();
    protected byte amount;
    protected short durability;
    protected int hideFlags;

    public ItemStack(ItemType itemType) {
        this(itemType, 1);
    }

    public ItemStack(ItemType itemType, int amount) {
        this(itemType, amount, (short) -1);
    }

    public ItemStack(BaseItemStack baseItemStack) {
        this(baseItemStack.itemType(), baseItemStack.amount(), baseItemStack.durability());
        nbtData(baseItemStack.nbtData());
        for (ItemFlag itemFlag : itemFlags()) {
            flagSet(itemFlag);
        }

        displayName(baseItemStack.displayName());
        lore(baseItemStack.lore());
    }

    public ItemStack(ItemType itemType, int amount, short durability) {
        this.itemType = itemType;
        this.amount = (byte) amount;
        this.durability = durability;
    }

    @Override
    public boolean flagSet(ItemFlag flag) {
        return (this.hideFlags & (1 << flag.getBitIndex())) == 1;
    }

    @Override
    public void itemFlag(ItemFlag flag, boolean active) {
        if (active) {
            this.hideFlags |= (1 << flag.getBitIndex());
        } else {
            this.hideFlags &= ~(1 << flag.getBitIndex());
        }
    }

    @Override
    public Set<ItemFlag> itemFlags() {
        Set<ItemFlag> flags = new HashSet<>();
        for (ItemFlag flag : ItemFlag.values()) {
            if (flagSet(flag)) {
                flags.add(flag);
            }
        }
        return Collections.unmodifiableSet(flags);
    }

    @Override
    public boolean canBeStacked(BaseItemStack stack) {
        return stack.itemType() == this.itemType && stack.nbtData().equals(this.nbtData);
    }

    @Override
    public BaseItemStack displayName(ChatElement<?> displayName) {
        this.displayName = displayName;
        return this;
    }

    @Override
    public void lore(List<ChatElement<?>> list) {
        this.lore = list;
    }

    @Override
    public void lore(int index, ChatElement<?> element) {
        this.lore.set(index, element);
    }

    @Override
    public void addToLore(ChatElement<?> element) {
        this.lore.add(element);
    }

    @Override
    public ItemStack deepClone() {
        return deepClone(ProtocolVersions.MINECRAFT_LATEST);
    }

    @Override
    public ItemStack deepClone(int protocolVersion) {
        try {
            ByteBuf buf = Unpooled.buffer();
            ItemStackSerializer.write(buf, this, protocolVersion);
            ItemStack itemStack = ItemStackSerializer.read(buf, protocolVersion);
            buf.release();
            return itemStack;
        } catch (Exception e){
            log.error("Failed to clone ItemStack", e);
            return ItemStack.NO_DATA;
        }
    }

    @Override
    public Collection<DataComponent> getComponents() {
        return componentsToAdd.values();
    }

    @Override
    public Collection<DataComponentType<?>> getComponentsToRemove() {
        return componentsToRemove;
    }

    @Override
    public <T extends DataComponent> T getComponent(Class<? extends DataComponent> type) {
        for (DataComponent component : componentsToAdd.values()) {
            if (type.isAssignableFrom(component.getClass())) {
                return (T) component;
            }
        }
        return null;
    }

    @Override
    public BaseItemStack addComponent(DataComponent component) {
        componentsToAdd.put(component.getClass(), component);
        componentsToRemove.remove(component.getType());
        return this;
    }

    @Override
    public BaseItemStack removeComponent(DataComponentType<?> type) {
        componentsToAdd.values().removeIf(component -> type.equals(component.getType()));
        componentsToRemove.add(type);
        return this;
    }

}
