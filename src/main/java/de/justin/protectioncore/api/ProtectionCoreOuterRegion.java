package de.justin.protectioncore.api;

import de.justin.protectioncore.util.Module;
import de.justin.protectioncore.util.Region;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.UUID;

public class ProtectionCoreOuterRegion {
    private Location location;
    private ArrayList<UUID> members;
    private ArrayList<UUID> allMembers;
    private UUID owner;
    private ArrayList<Module> modules;
    private ArrayList<String> customModules;
    private Location min;
    private Location max;
    private boolean isRunning;
    public ProtectionCoreOuterRegion(Region region) {
    }
    public Location getLocation() {
        return location.clone();
    }
    public ArrayList<UUID> getAllMembers() {return allMembers;}
    public UUID getOwner() {
        return owner;
    }
    public ArrayList<UUID> getMembers() {
        return (ArrayList<UUID>) members.clone();
    }
    public ArrayList<Module> getModules() {
        return (ArrayList<Module>) modules.clone();
    }
    public ArrayList<String> getCustomModules() {return (ArrayList<String>) customModules.clone();}

    public Location getMin() {
        return min.clone();
    }
    public Location getMax() {
        return max.clone();
    }
    public boolean isRunning() {
        return isRunning;
    }
}
