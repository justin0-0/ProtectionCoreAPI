package de.justin.api;

import org.bukkit.Location;

import javax.annotation.Nullable;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.UUID;

public interface ProtectionCoreRegion {
    Location getLocation();
    ArrayList<UUID> getAllMembers();
    UUID getOwner();
    ArrayList<UUID> getWhitelist();
    ArrayList<String> getCustomModules();
    @Nullable
    Rectangle2D getInnerRegion();
    Rectangle2D getOuterRegion();
}
