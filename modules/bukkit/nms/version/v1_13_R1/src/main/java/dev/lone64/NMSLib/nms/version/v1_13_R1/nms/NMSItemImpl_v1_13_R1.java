package dev.lone64.NMSLib.nms.version.v1_13_R1.nms;

import dev.lone64.NMSLib.nms.common.nms.NMSItem;
import net.minecraft.server.v1_13_R1.NBTTagCompound;
import org.bukkit.craftbukkit.v1_13_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class NMSItemImpl_v1_13_R1 implements NMSItem {
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