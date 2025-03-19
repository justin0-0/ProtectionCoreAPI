package de.justin.api;

import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

public interface ProtectionCoreAPI {
    @Nullable ProtectionCoreRegion getRegion(Location location);
    ItemStack addCustomModule(String key, ItemStack itemStack);
    List<ProtectionCoreRegion> getWhitelistedRegions(UUID uuid);
    List<ProtectionCoreRegion> getOwnedRegions(UUID uuid);
}
