package dev.lone64.NMSLib.nms.common.nbt;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public interface NBTItem {
    NBTItem setStringTag(String key, String value);
    NBTItem setIntTag(String key, int value);
    NBTItem setDoubleTag(String key, double value);
    NBTItem setFloatTag(String key, float value);
    NBTItem setLongTag(String key, long value);
    NBTItem setBooleanTag(String key, boolean value);
    NBTItem setUUIDTag(String key, UUID value);

    NBTItem removeTag(String key);

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

    ItemStack getItem();
}