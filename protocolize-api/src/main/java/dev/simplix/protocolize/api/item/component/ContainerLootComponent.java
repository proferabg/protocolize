package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface ContainerLootComponent extends DataComponent {

    String getLootTable();

    void setLootTable(String lootTable);

    Long getSeed();

    void setSeed(Long seed);

    static ContainerLootComponent create(String lootTable) {
        return Protocolize.getService(Factory.class).create(lootTable);
    }

    static ContainerLootComponent create(String lootTable, Long seed) {
        return Protocolize.getService(Factory.class).create(lootTable, seed);
    }

    interface Factory {

        ContainerLootComponent create(String lootTable);
        ContainerLootComponent create(String lootTable, Long seed);

    }

}
