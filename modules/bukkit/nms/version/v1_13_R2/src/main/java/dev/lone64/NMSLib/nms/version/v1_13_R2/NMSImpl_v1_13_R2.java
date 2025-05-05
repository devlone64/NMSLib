package dev.lone64.NMSLib.nms.version.v1_13_R2;

import dev.lone64.NMSLib.nms.common.NMS;
import dev.lone64.NMSLib.nms.common.nbt.NBTEntity;
import dev.lone64.NMSLib.nms.common.nbt.NBTItem;
import dev.lone64.NMSLib.nms.common.nms.NMSItem;
import dev.lone64.NMSLib.nms.version.v1_13_R2.nbt.NBTEntityImpl_v1_13_R2;
import dev.lone64.NMSLib.nms.version.v1_13_R2.nbt.NBTItemImpl_v1_13_R2;
import dev.lone64.NMSLib.nms.version.v1_13_R2.nms.NMSItemImpl_v1_13_R2;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

public class NMSImpl_v1_13_R2 implements NMS {
    @Override
    public String getName() {
        return "v1_13_R2";
    }

    @Override
    public NMSItem getNMSItem() {
        return new NMSItemImpl_v1_13_R2();
    }

    @Override
    public NBTItem loadItem(ItemStack src) {
        return new NBTItemImpl_v1_13_R2(src);
    }

    @Override
    public NBTEntity loadEntity(Entity src) {
        return new NBTEntityImpl_v1_13_R2(src);
    }
}