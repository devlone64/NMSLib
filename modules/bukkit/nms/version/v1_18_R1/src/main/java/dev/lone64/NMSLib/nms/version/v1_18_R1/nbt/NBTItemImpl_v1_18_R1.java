package dev.lone64.NMSLib.nms.version.v1_18_R1.nbt;

import dev.lone64.NMSLib.nms.common.nbt.NBTItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.ItemStack;
import org.bukkit.craftbukkit.v1_18_R1.inventory.CraftItemStack;

import java.util.UUID;

public class NBTItemImpl_v1_18_R1 implements NBTItem {
    private final ItemStack item;
    private final CompoundTag compoundTag;

    public NBTItemImpl_v1_18_R1(Object item) {
        this.item = CraftItemStack.asNMSCopy((org.bukkit.inventory.ItemStack) item);
        this.compoundTag = this.item.getOrCreateTag();
    }

    public NBTItem setTag(String key, Tag value) {
        this.compoundTag.put(key, value);
        return this;
    }

    @Override
    public NBTItem setStringTag(String key, String value) {
        this.compoundTag.putString(key, value);
        return this;
    }

    @Override
    public NBTItem setIntTag(String key, int value) {
        this.compoundTag.putInt(key, value);
        return this;
    }

    @Override
    public NBTItem setDoubleTag(String key, double value) {
        this.compoundTag.putDouble(key, value);
        return this;
    }

    @Override
    public NBTItem setFloatTag(String key, float value) {
        this.compoundTag.putFloat(key, value);
        return this;
    }

    public NBTItem setLongTag(String key, long value) {
        this.compoundTag.putLong(key, value);
        return this;
    }

    public NBTItem setBooleanTag(String key, boolean value) {
        this.compoundTag.putBoolean(key, value);
        return this;
    }

    @Override
    public NBTItem setUUIDTag(String key, UUID value) {
        this.compoundTag.putUUID(key, value);
        return this;
    }

    @Override
    public NBTItem removeTag(String key) {
        this.compoundTag.remove(key);
        return this;
    }

    public Tag getTag(String key) {
        return getTag(key, null);
    }

    public Tag getTag(String key, Tag def) {
        if (!hasTag(key)) return def;
        return this.compoundTag.get(key);
    }

    @Override
    public String getStringTag(String key) {
        return this.getStringTag(key, null);
    }

    @Override
    public String getStringTag(String key, String def) {
        if (!hasTag(key)) return def;
        return this.compoundTag.getString(key);
    }

    @Override
    public int getIntTag(String key) {
        return this.getIntTag(key, 0);
    }

    @Override
    public int getIntTag(String key, int def) {
        if (!hasTag(key)) return def;
        return this.compoundTag.getInt(key);
    }

    @Override
    public double getDoubleTag(String key) {
        return this.getDoubleTag(key, 0.0);
    }

    @Override
    public double getDoubleTag(String key, double def) {
        if (!hasTag(key)) return def;
        return this.compoundTag.getDouble(key);
    }

    @Override
    public float getFloatTag(String key) {
        return this.getFloatTag(key, 0.0f);
    }

    @Override
    public float getFloatTag(String key, float def) {
        if (!hasTag(key)) return def;
        return this.compoundTag.getFloat(key);
    }

    @Override
    public long getLongTag(String key) {
        return this.getLongTag(key, 0L);
    }

    @Override
    public long getLongTag(String key, long def) {
        if (!hasTag(key)) return def;
        return this.compoundTag.getLong(key);
    }

    @Override
    public boolean getBooleanTag(String key) {
        return this.getBooleanTag(key, false);
    }

    @Override
    public boolean getBooleanTag(String key, boolean def) {
        if (!hasTag(key)) return def;
        return this.compoundTag.getBoolean(key);
    }

    @Override
    public UUID getUUIDTag(String key) {
        return this.getUUIDTag(key, null);
    }

    @Override
    public UUID getUUIDTag(String key, UUID def) {
        if (!hasTag(key)) return def;
        return this.compoundTag.getUUID(key);
    }

    @Override
    public boolean hasTag(String key) {
        return this.compoundTag.contains(key);
    }

    @Override
    public org.bukkit.inventory.ItemStack getItem() {
        return CraftItemStack.asBukkitCopy(this.item);
    }
}