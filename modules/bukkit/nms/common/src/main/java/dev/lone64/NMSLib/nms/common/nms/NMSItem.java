package dev.lone64.NMSLib.nms.common.nms;

import org.bukkit.inventory.ItemStack;

public interface NMSItem {
    String getItemName(ItemStack src);
    String getItemPath(ItemStack src);
    String saveToJsonString(ItemStack src);
}