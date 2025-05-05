package dev.lone64.NMSLib.nms.version.v1_21_R4;

import dev.lone64.NMSLib.nms.common.NMS;
import dev.lone64.NMSLib.nms.common.nbt.NBTEntity;
import dev.lone64.NMSLib.nms.common.nbt.NBTItem;
import dev.lone64.NMSLib.nms.common.nms.NMSItem;
import dev.lone64.NMSLib.nms.version.v1_21_R4.nbt.NBTEntityImpl_v1_21_R4;
import dev.lone64.NMSLib.nms.version.v1_21_R4.nbt.NBTItemImpl_v1_21_R4;
import dev.lone64.NMSLib.nms.version.v1_21_R4.nms.NMSItemImpl_v1_21_R4;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

public class NMSImpl_v1_21_R4 implements NMS {
    @Override
    public String getName() {
        return "v1_21_R4";
    }

    @Override
    public NMSItem getNMSItem() {
        return new NMSItemImpl_v1_21_R4();
    }

    @Override
    public NBTItem loadItem(ItemStack src) {
        return new NBTItemImpl_v1_21_R4(src);
    }

    @Override
    public NBTEntity loadEntity(Entity src) {
        return new NBTEntityImpl_v1_21_R4(src);
    }
}