package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.providers.MappingProvider;
import dev.simplix.protocolize.api.util.Either;
import dev.simplix.protocolize.api.util.ProtocolUtil;
import dev.simplix.protocolize.data.Enchantment;

public class EnchantmentHolder<T> {

    private static final MappingProvider MAPPING_PROVIDER = Protocolize.mappingProvider();
    private final Either<T, Enchantment> either;

    public EnchantmentHolder(Enchantment enchantment) {
        this.either = Either.right(enchantment);
    }

    public EnchantmentHolder(T enchantment) {
        this.either = Either.left(enchantment);
    }

    public boolean isRegistryType(){
        return either.isRight();
    }

    public boolean isRawType(){
        return either.isLeft();
    }

    public Object getRawType(){
        if(either.isRight())
            return either.getRight();
        else
            return either.getLeft();
    }

    public T getCastType(){
        return either.getLeft();
    }

    public Enchantment getRegistryType(){
        return either.getRight();
    }

    public static EnchantmentHolder<String> fromString(String enchantment){
        try {
            Enchantment enchantmentEnum = Enchantment.valueOf(ProtocolUtil.removeNamespace(enchantment));
            return new EnchantmentHolder<>(enchantmentEnum);
        } catch (IllegalArgumentException e) {
            return new EnchantmentHolder<>(enchantment);
        }
    }

    public static EnchantmentHolder<Integer> fromProtocol(int enchantmentId, int protocolVersion){
        Enchantment enchantment = MAPPING_PROVIDER.mapIdToEnum(enchantmentId, protocolVersion, Enchantment.class);
        if(enchantment != null) {
            return new EnchantmentHolder<>(enchantment);
        } else {
            return new EnchantmentHolder<>(enchantmentId);
        }
    }

    @Override
    public String toString() {
        if(either.isRight()){
            return "minecraft:" + either.getRight().toString().toLowerCase();
        } else {
            return either.getLeft().toString().toLowerCase();
        }
    }

}
