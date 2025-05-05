package dev.lone64.NMSLib.nms.version.v1_21_R4.nms;

import dev.lone64.NMSLib.nms.common.nms.NMSItem;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_21_R4.CraftServer;
import org.bukkit.craftbukkit.v1_21_R4.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class NMSItemImpl_v1_21_R4 implements NMSItem {
    @Override
    public String getItemName(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        return nmsItem.getItem().getName(nmsItem).getString();
    }

    @Override
    public String getItemPath(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        return nmsItem.getItem().getDescriptionId();
    }

    @Override
    public String saveToJsonString(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        var server = ((CraftServer) Bukkit.getServer()).getServer();
        var provider = server.registryAccess();
        return nmsItem.save(provider).toString();
    }
}