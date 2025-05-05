package dev.lone64.NMSLib.nms.common.nbt;

import java.util.UUID;

public interface NBTEntity {
    NBTEntity setStringTag(String key, String value);
    NBTEntity setIntTag(String key, int value);
    NBTEntity setDoubleTag(String key, double value);
    NBTEntity setFloatTag(String key, float value);
    NBTEntity setLongTag(String key, long value);
    NBTEntity setBooleanTag(String key, boolean value);
    NBTEntity setUUIDTag(String key, UUID value);

    NBTEntity removeTag(String key);
    
    String getStringTag(String key);
    String getStringTag(String key, String def);

    int getIntTag(String key);
    int getIntTag(String key, int def);

    double getDoubleTag(String key);
    double getDoubleTag(String key, double def);

    float getFloatTag(String key);
    float getFloatTag(String key, float def);

    long getLongTag(String key);
    long getLongTag(String key, long def);

    boolean getBooleanTag(String key);
    boolean getBooleanTag(String key, boolean def);

    UUID getUUIDTag(String key);
    UUID getUUIDTag(String key, UUID def);

    boolean hasTag(String key);
}