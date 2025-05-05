package dev.lone64.NMSLib.common;

import dev.lone64.NMSLib.nms.common.NMS;
import dev.lone64.NMSLib.nms.version.v1_12_R1.NMSImpl_v1_12_R1;
import dev.lone64.NMSLib.nms.version.v1_13_R1.NMSImpl_v1_13_R1;
import dev.lone64.NMSLib.nms.version.v1_13_R2.NMSImpl_v1_13_R2;
import dev.lone64.NMSLib.nms.version.v1_14_R1.NMSImpl_v1_14_R1;
import dev.lone64.NMSLib.nms.version.v1_15_R1.NMSImpl_v1_15_R1;
import dev.lone64.NMSLib.nms.version.v1_16_R1.NMSImpl_v1_16_R1;
import dev.lone64.NMSLib.nms.version.v1_16_R2.NMSImpl_v1_16_R2;
import dev.lone64.NMSLib.nms.version.v1_16_R3.NMSImpl_v1_16_R3;
import dev.lone64.NMSLib.nms.version.v1_17_R1.NMSImpl_v1_17_R1;
import dev.lone64.NMSLib.nms.version.v1_18_R1.NMSImpl_v1_18_R1;
import dev.lone64.NMSLib.nms.version.v1_18_R2.NMSImpl_v1_18_R2;
import dev.lone64.NMSLib.nms.version.v1_19_R1.NMSImpl_v1_19_R1;
import dev.lone64.NMSLib.nms.version.v1_19_R2.NMSImpl_v1_19_R2;
import dev.lone64.NMSLib.nms.version.v1_19_R3.NMSImpl_v1_19_R3;
import dev.lone64.NMSLib.nms.version.v1_20_R1.NMSImpl_v1_20_R1;
import dev.lone64.NMSLib.nms.version.v1_20_R2.NMSImpl_v1_20_R2;
import dev.lone64.NMSLib.nms.version.v1_20_R3.NMSImpl_v1_20_R3;
import dev.lone64.NMSLib.nms.version.v1_20_R4.NMSImpl_v1_20_R4;
import dev.lone64.NMSLib.nms.version.v1_21_R1.NMSImpl_v1_21_R1;
import dev.lone64.NMSLib.nms.version.v1_21_R2.NMSImpl_v1_21_R2;
import dev.lone64.NMSLib.nms.version.v1_21_R3.NMSImpl_v1_21_R3;
import dev.lone64.NMSLib.nms.version.v1_21_R4.NMSImpl_v1_21_R4;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class NMSLib {
    public static void setInstance(Plugin plugin) {
        var nmsImpl = getNMS();
        plugin.getLogger().info("Loading NMS %s".formatted(nmsImpl.getName()));
    }

    public static NMS getNMS() {
        return switch (getCurrentVersion()) {
            case "1.12", "1.12.1", "1.12.2" -> new NMSImpl_v1_12_R1();
            case "1.13" -> new NMSImpl_v1_13_R1();
            case "1.13.1", "1.13.2" -> new NMSImpl_v1_13_R2();
            case "1.14", "1.14.1", "1.14.2", "1.14.3", "1.14.4" -> new NMSImpl_v1_14_R1();
            case "1.15", "1.15.1", "1.15.2" -> new NMSImpl_v1_15_R1();
            case "1.16", "1.16.1" -> new NMSImpl_v1_16_R1();
            case "1.16.2", "1.16.3" -> new NMSImpl_v1_16_R2();
            case "1.16.4", "1.16.5" -> new NMSImpl_v1_16_R3();
            case "1.17", "1.17.1" -> new NMSImpl_v1_17_R1();
            case "1.18", "1.18.1" -> new NMSImpl_v1_18_R1();
            case "1.18.2" -> new NMSImpl_v1_18_R2();
            case "1.19", "1.19.1", "1.19.2" -> new NMSImpl_v1_19_R1();
            case "1.19.3" -> new NMSImpl_v1_19_R2();
            case "1.19.4" -> new NMSImpl_v1_19_R3();
            case "1.20", "1.20.1" -> new NMSImpl_v1_20_R1();
            case "1.20.2" -> new NMSImpl_v1_20_R2();
            case "1.20.3", "1.20.4" -> new NMSImpl_v1_20_R3();
            case "1.20.5", "1.20.6" -> new NMSImpl_v1_20_R4();
            case "1.21", "1.21.1" -> new NMSImpl_v1_21_R1();
            case "1.21.2", "1.21.3" -> new NMSImpl_v1_21_R2();
            case "1.21.4" -> new NMSImpl_v1_21_R3();
            case "1.21.5" -> new NMSImpl_v1_21_R4();
            default -> throw new IllegalArgumentException("Version %s is an unsupported version of Minecraft.".formatted(getCurrentVersion()));
        };
    }

    public static String getCurrentVersion() {
        return Bukkit.getServer().getBukkitVersion().replace("-R0.1-SNAPSHOT", "");
    }
}