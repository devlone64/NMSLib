package dev.lone64.NMSLib.nms.version.v1_19_R3.nbt;

import dev.lone64.NMSLib.nms.common.nbt.NBTEntity;
import lombok.Getter;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Objects;
import java.util.UUID;

@Getter
public class NBTEntityImpl_v1_19_R3 implements NBTEntity {
    private final Entity entity;

    public NBTEntityImpl_v1_19_R3(Entity entity) {
        this.entity = entity;
    }

    private PersistentDataContainer getPersistentDataContainer() {
        return this.entity.getPersistentDataContainer();
    }

    private <P, C> NBTEntity setTag(String key, PersistentDataType<P, C> type, C value) {
        key = key.replace("-", "_").replace(" ", "_").toLowerCase();
        this.getPersistentDataContainer().set(Objects.requireNonNull(NamespacedKey.fromString("nms_tag_entity:%s".formatted(key))), type, value);
        return this;
    }

    private <P, C> C getTag(String key, PersistentDataType<P, C> type) {
        key = key.replace("-", "_").replace(" ", "_").toLowerCase();
        return getPersistentDataContainer().get(Objects.requireNonNull(NamespacedKey.fromString("nms_tag_entity:%s".formatted(key))), type);
    }

    @Override
    public NBTEntity setStringTag(String key, String value) {
        return setTag(key, PersistentDataType.STRING, value);
    }

    @Override
    public NBTEntity setIntTag(String key, int value) {
        return setTag(key, PersistentDataType.INTEGER, value);
    }

    @Override
    public NBTEntity setDoubleTag(String key, double value) {
        return setTag(key, PersistentDataType.DOUBLE, value);
    }

    @Override
    public NBTEntity setFloatTag(String key, float value) {
        return setTag(key, PersistentDataType.FLOAT, value);
    }

    public NBTEntity setLongTag(String key, long value) {
        return setTag(key, PersistentDataType.LONG, value);
    }

    public NBTEntity setBooleanTag(String key, boolean value) {
        return setTag(key, PersistentDataType.BOOLEAN, value);
    }

    @Override
    public NBTEntity setUUIDTag(String key, UUID value) {
        return setTag(key, PersistentDataType.STRING, value.toString());
    }

    @Override
    public NBTEntity removeTag(String key) {
        key = key.replace("-", "_").replace(" ", "_").toLowerCase();
        this.getPersistentDataContainer().remove(Objects.requireNonNull(NamespacedKey.fromString("nms_tag_entity:%s".formatted(key))));
        return this;
    }

    @Override
    public String getStringTag(String key) {
        return this.getStringTag(key, null);
    }

    @Override
    public String getStringTag(String key, String def) {
        if (!hasTag(key)) return def;
        return getTag(key, PersistentDataType.STRING);
    }

    @Override
    public int getIntTag(String key) {
        return this.getIntTag(key, 0);
    }

    @Override
    public int getIntTag(String key, int def) {
        if (!hasTag(key)) return def;
        return getTag(key, PersistentDataType.INTEGER);
    }

    @Override
    public double getDoubleTag(String key) {
        return this.getDoubleTag(key, 0.0);
    }

    @Override
    public double getDoubleTag(String key, double def) {
        if (!hasTag(key)) return def;
        return getTag(key, PersistentDataType.DOUBLE);
    }

    @Override
    public float getFloatTag(String key) {
        return this.getFloatTag(key, 0.0f);
    }

    @Override
    public float getFloatTag(String key, float def) {
        if (!hasTag(key)) return def;
        return getTag(key, PersistentDataType.FLOAT);
    }

    @Override
    public long getLongTag(String key) {
        return this.getLongTag(key, 0L);
    }

    @Override
    public long getLongTag(String key, long def) {
        if (!hasTag(key)) return def;
        return getTag(key, PersistentDataType.LONG);
    }

    @Override
    public boolean getBooleanTag(String key) {
        return this.getBooleanTag(key, false);
    }

    @Override
    public boolean getBooleanTag(String key, boolean def) {
        if (!hasTag(key)) return def;
        return getTag(key, PersistentDataType.BOOLEAN);
    }

    @Override
    public UUID getUUIDTag(String key) {
        return this.getUUIDTag(key, null);
    }

    @Override
    public UUID getUUIDTag(String key, UUID def) {
        if (!hasTag(key)) return def;
        return UUID.fromString(getTag(key, PersistentDataType.STRING));
    }

    @Override
    public boolean hasTag(String key) {
        key = key.replace("-", "_").replace(" ", "_").toLowerCase();
        return getPersistentDataContainer().has(Objects.requireNonNull(NamespacedKey.fromString("nms_tag_entity:%s".formatted(key))), PersistentDataType.BOOLEAN);
    }
}