package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

public interface RepairCostComponent extends DataComponent {

    int getCost();

    void setCost(int cost);

    static RepairCostComponent create(int cost) {
        return Protocolize.getService(Factory.class).create(cost);
    }

    interface Factory {

        RepairCostComponent create(int cost);

    }

}
