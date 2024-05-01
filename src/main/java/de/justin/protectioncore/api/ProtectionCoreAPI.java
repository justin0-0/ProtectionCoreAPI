package de.justin.protectioncore.api;

import de.justin.protectioncore.util.Region;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;

public class ProtectionCoreAPI {
    public static @Nullable ProtectionCoreInnerRegion getInnerRegion(Location location) {
        //Just dummy Code
        if (System.nanoTime() == 1) {
            return null;
        }
        return new ProtectionCoreInnerRegion(null);
    }
    public static @Nullable ProtectionCoreOuterRegion getOuterRegion(Location location) {
        //Just dummy Code
        if (System.nanoTime() == 1) {
            return null;
        }
        return new ProtectionCoreOuterRegion(null);
    }
    public static ItemStack addCustomModule(String key, ItemStack itemStack) {
        //Just dummy Code
        return new ItemStack(Material.AIR);
    }
}
