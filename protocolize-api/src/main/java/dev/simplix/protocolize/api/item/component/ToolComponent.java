package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.ToolRule;

import java.util.List;

public interface ToolComponent extends DataComponent {

    List<ToolRule> getRules();

    void setRules(List<ToolRule> rules);

    void addRule(ToolRule rule);

    void removeRule(ToolRule rule);

    void removeAllRules();

    float getMiningSpeed();

    void setMiningSpeed(float miningSpeed);

    int getDamagePerBlock();

    void setDamagePerBlock(int damagePerBlock);

    boolean isCanDestroyBlocksInCreative();

    void setCanDestroyBlocksInCreative(boolean canDestroyBlocksInCreative);

    static ToolComponent create(List<ToolRule> rules, float miningSpeed, int damagePerBlock, boolean canDestroyBlocksInCreative) {
        return Protocolize.getService(Factory.class).create(rules, miningSpeed, damagePerBlock, canDestroyBlocksInCreative);
    }

    interface Factory {

        ToolComponent create(List<ToolRule> rules, float miningSpeed, int damagePerBlock, boolean canDestroyBlocksInCreative);

    }

}
