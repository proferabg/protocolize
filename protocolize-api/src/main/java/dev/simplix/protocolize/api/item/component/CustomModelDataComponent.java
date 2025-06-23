package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;

import java.util.List;

public interface CustomModelDataComponent extends DataComponent {

    @Deprecated
    int getCustomModelData();

    @Deprecated
    void setCustomModelData(int customModelData);

    List<Float> getFloats();

    void setFloats(List<Float> floats);

    void addFloat(float value);

    void removeFloat(float value);

    void clearFloats();

    List<Boolean> getFlags();

    void setFlags(List<Boolean> flags);

    void addFlag(boolean value);

    void removeFlag(boolean value);

    void clearFlags();

    List<String> getStrings();

    void setStrings(List<String> strings);

    void addString(String value);

    void removeString(String value);

    void clearStrings();

    List<Integer> getColors();

    void setColors(List<Integer> colors);

    void addColor(Integer value);

    void removeColor(Integer value);

    void clearColors();

    static CustomModelDataComponent create(int customModelData) {
        return Protocolize.getService(Factory.class).create(customModelData);
    }

    interface Factory {

        CustomModelDataComponent create(int customModelData);

        CustomModelDataComponent create(List<Float> floats, List<Boolean> flags, List<String> strings, List<Integer> colors);

    }

}
