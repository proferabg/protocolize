package dev.simplix.protocolize.api.item.component;

import io.netty.buffer.ByteBuf;

public interface DataComponent {

    void read(ByteBuf buf, int protocolVersion) throws Exception;

    void write(ByteBuf buf, int protocolVersion) throws Exception;

    DataComponentType<?> getType();

}
