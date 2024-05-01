package de.justin.protectioncore;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class ProtectionCore extends JavaPlugin {

    private static JavaPlugin plugin;
    public static ItemStack testmodule;

    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {

    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}
