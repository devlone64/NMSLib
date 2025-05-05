package dev.lone64.NMSLib;

import dev.lone64.NMSLib.common.NMSLib;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Getter private static Main instance;

    @Override
    public void onLoad() {
        instance = this;
        NMSLib.setInstance(this);
    }
}