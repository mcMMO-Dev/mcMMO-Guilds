package dev.nossr50.mcmmoguilds;

import com.gmail.nossr50.mcMMO;
import dev.nossr50.mcmmoguilds.listeners.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GuildsCore extends JavaPlugin {

    private final mcMMO mcMMOPluginRef = null;

    @Override
    public void onEnable() {
        // Plugin startup logic
        if(Bukkit.getPluginManager().getPlugin("mcMMO").isEnabled()) {
            //TODO: Add logic to make sure it's a compatible version of mcMMO

            //Store reference
            mcMMO mcMMOPlugin = (mcMMO) Bukkit.getPluginManager().getPlugin("mcMMO");

            //Register listeners
            Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);

            Bukkit.getLogger().info("Guilds enabled.");
        } else {
            Bukkit.getLogger().info("Guilds failed to load.");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
