package de.justin.protectioncore.util;


import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public enum Module {
    PROTECTION_ONE(null),
    PROTECTION_TWO(null),
    PROTECTION_THREE(null),
    PROTECTION_FOUR(null),
    PVP(null),
    CREEPER(null),
    MOB(null),
    NOTHING(null);

    public ItemStack itemStack;
    Module(ItemStack itemStack1) {itemStack1 = itemStack;}
    public static Module getModuleByItem(ItemStack itemStack) {
        return null;
    }
}

