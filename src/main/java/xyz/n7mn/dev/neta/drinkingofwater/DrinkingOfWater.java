package xyz.n7mn.dev.neta.drinkingofwater;

import org.bukkit.plugin.java.JavaPlugin;

public final class DrinkingOfWater extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new Listener(this),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
