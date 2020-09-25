package xyz.n7mn.dev.neta.drinkingofwater;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

class Listener implements org.bukkit.event.Listener {

    private final Plugin plugin;

    public Listener(Plugin plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent e){
        new Timer(plugin, e.getPlayer()).runTaskLaterAsynchronously(plugin, 72000L);
    }

}
