package dev.lone64.NMSLib.nms.version.v1_16_R3.nms;

import dev.lone64.NMSLib.nms.common.nms.NMSItem;
import net.minecraft.server.v1_16_R3.NBTTagCompound;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class NMSItemImpl_v1_16_R3 implements NMSItem {
    @Override
    public String getItemName(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        return nmsItem.getName().getString();
    }

    @Override
    public String getItemPath(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        return nmsItem.j();
    }

    @Override
    public String saveToJsonString(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        return nmsItem.save(new NBTTagCompound()).toString();
    }
}