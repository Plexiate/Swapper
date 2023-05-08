package me.plexiate.com.swapper;

import me.plexiate.com.swapper.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Swapper extends JavaPlugin {


    private static Swapper PLUGIN;

    @Override
    public void onEnable() {

        PLUGIN = this;
        saveDefaultConfig();

        getCommand("survival").setExecutor(new survival());
        getCommand("spectator").setExecutor(new spectator());
        getCommand("creative").setExecutor(new creative());
        getCommand("adventure").setExecutor(new adventure());
        getCommand("sreload").setExecutor(new sreload());
        }

    public static Swapper getInstance() {
        return PLUGIN;
    }
}
