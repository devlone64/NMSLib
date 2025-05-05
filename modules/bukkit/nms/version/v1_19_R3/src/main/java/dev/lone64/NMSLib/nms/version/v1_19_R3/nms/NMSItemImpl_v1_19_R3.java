package dev.lone64.NMSLib.nms.version.v1_19_R3.nms;

import dev.lone64.NMSLib.nms.common.nms.NMSItem;
import net.minecraft.nbt.CompoundTag;
import org.bukkit.craftbukkit.v1_19_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class NMSItemImpl_v1_19_R3 implements NMSItem {
    @Override
    public String getItemName(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        return nmsItem.getItem().getName(nmsItem).getString();
    }

    @Override
    public String getItemPath(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        return nmsItem.getDescriptionId();
    }

    @Override
    public String saveToJsonString(ItemStack src) {
        var nmsItem = CraftItemStack.asNMSCopy(src);
        return nmsItem.save(new CompoundTag()).toString();
    }
}