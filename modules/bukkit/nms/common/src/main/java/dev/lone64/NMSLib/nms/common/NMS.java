package dev.lone64.NMSLib.nms.common;

import dev.lone64.NMSLib.nms.common.nbt.NBTEntity;
import dev.lone64.NMSLib.nms.common.nbt.NBTItem;
import dev.lone64.NMSLib.nms.common.nms.NMSItem;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

public interface NMS {
    String getName();

    NMSItem getNMSItem();

    NBTItem loadItem(ItemStack src);
    NBTEntity loadEntity(Entity src);
}