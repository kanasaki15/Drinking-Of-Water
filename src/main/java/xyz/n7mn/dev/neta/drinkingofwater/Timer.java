package xyz.n7mn.dev.neta.drinkingofwater;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

class Timer extends BukkitRunnable {

    private final Player player;
    private final Plugin plugin;

    public Timer(Plugin plugin, Player player){
        this.player = player;
        this.plugin = plugin;
    }

    @Override
    public void run() {
        if (player != null){
            player.sendMessage(ChatColor.RED + "1hごとに水飲んで！");

            new Timer(plugin, player).runTaskLaterAsynchronously(plugin, 72000L);
        }
    }
}
