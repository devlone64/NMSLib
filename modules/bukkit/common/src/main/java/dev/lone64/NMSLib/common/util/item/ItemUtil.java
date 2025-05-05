package dev.lone64.NMSLib.common.util.item;

import dev.lone64.NMSLib.common.NMSLib;
import dev.lone64.NMSLib.common.util.file.JsonUtil;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class ItemUtil {
    public static String getItemName(Plugin plugin, Player player, ItemStack src) {
        var locale = player.getLocale();
        if (src == null) return "";
        var meta = src.getItemMeta();
        if (meta != null && meta.hasDisplayName()) return meta.getDisplayName();
        var data = JsonUtil.loadJson(plugin, "repositories/v%s/%s.json".formatted(NMSLib.getCurrentVersion(), locale.toLowerCase()));
        if (data == null) return NMSLib.getNMS().getNMSItem().getItemName(src);
        var itemPath = NMSLib.getNMS().getNMSItem().getItemPath(src);
        return data.get(itemPath).getAsString();
    }
}