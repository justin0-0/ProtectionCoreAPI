package de.justin.protectioncore.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ProtectionCoreBreakEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;
    private Location location;
    private Player player;
    public ProtectionCoreBreakEvent(Location location, Player player){
        this.isCancelled = false;
        this.location = location;
        this.player = player;
    }
    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS_LIST;
    }
    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
    @Override
    public boolean isCancelled() {
        return isCancelled;
    }
    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }
    public Location getLocation() {
        return location.clone();
    }
    public Player getPlayer() {return player;}
}
