package de.justin.protectioncore.util;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.UUID;


public class Region {
    public Region(int x, int z, int x2, int z2, Location protectionCore, ArrayList<UUID> members, ArrayList<Module> modules, ArrayList<String> customModules) {
    }
    private Rectangle2D rectangle2D;
    private Location location;
    private ArrayList<UUID> members = new ArrayList<>();
    private ArrayList<Module> modules = new ArrayList<>();
    private ArrayList<String> customModules = new ArrayList<>();
    public Location getProtectionCore() {return null;}
    public ArrayList<UUID> getMembers() {return members;}
    public Rectangle2D getProtectedRegion() {
        return rectangle2D;
    }
    public ArrayList<Module> getModules() {return modules;}
    public ArrayList<String> getCustomModules() {return customModules;}
}

