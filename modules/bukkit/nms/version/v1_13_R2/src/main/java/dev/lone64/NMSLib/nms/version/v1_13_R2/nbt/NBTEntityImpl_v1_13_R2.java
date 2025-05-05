package dev.lone64.NMSLib.nms.version.v1_13_R2.nbt;

import dev.lone64.NMSLib.nms.common.nbt.NBTEntity;
import lombok.Getter;
import net.minecraft.server.v1_13_R2.Entity;
import net.minecraft.server.v1_13_R2.NBTBase;
import net.minecraft.server.v1_13_R2.NBTTagCompound;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftEntity;

import java.util.UUID;

@Getter
public class NBTEntityImpl_v1_13_R2 implements NBTEntity {
    private final Entity entity;
    private final NBTTagCompound compoundTag;

    public NBTEntityImpl_v1_13_R2(Object entity) {
        this.entity = ((CraftEntity) entity).getHandle();
        this.compoundTag = new NBTTagCompound();
        this.entity.f(this.compoundTag);
    }

    public NBTEntity setTag(String key, NBTBase value) {
        this.compoundTag.set(key, value);
        this.entity.save(this.compoundTag);
        return this;
    }

    @Override
    public NBTEntity setStringTag(String key, String value) {
        this.compoundTag.setString(key, value);
        this.entity.save(this.compoundTag);
        return this;
    }

    @Override
    public NBTEntity setIntTag(String key, int value) {
        this.compoundTag.setInt(key, value);
        this.entity.save(this.compoundTag);
        return this;
    }

    @Override
    public NBTEntity setDoubleTag(String key, double value) {
        this.compoundTag.setDouble(key, value);
        this.entity.save(this.compoundTag);
        return this;
    }

    @Override
    public NBTEntity setFloatTag(String key, float value) {
        this.compoundTag.setFloat(key, value);
        this.entity.save(this.compoundTag);
        return this;
    }

    public NBTEntity setLongTag(String key, long value) {
        this.compoundTag.setLong(key, value);
        this.entity.save(this.compoundTag);
        return this;
    }

    public NBTEntity setBooleanTag(String key, boolean value) {
        this.compoundTag.setBoolean(key, value);
        this.entity.save(this.compoundTag);
        return this;
    }

    @Override
    public NBTEntity setUUIDTag(String key, UUID value) {
        this.compoundTag.setString(key, value.toString());
        this.entity.save(this.compoundTag);
        return this;
    }

    @Override
    public NBTEntity removeTag(String key) {
        this.compoundTag.remove(key);
        return this;
    }

    public NBTBase getTag(String key) {
        return getTag(key, null);
    }

    public NBTBase getTag(String key, NBTBase def) {
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
        return UUID.fromString(this.compoundTag.getString(key));
    }

    @Override
    public boolean hasTag(String key) {
        return this.compoundTag.hasKey(key);
    }
}