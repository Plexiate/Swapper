package me.plexiate.com.swapper;

import me.plexiate.com.swapper.commands.adventure;
import me.plexiate.com.swapper.commands.creative;
import me.plexiate.com.swapper.commands.spectator;
import me.plexiate.com.swapper.commands.survival;
import org.bukkit.plugin.java.JavaPlugin;

public final class Swapper extends JavaPlugin {
    private static Swapper instance;

    @Override
    public void onEnable() {
        instance = this;

        System.out.println("Swapper 1.0 loaded!");
        getCommand("survival").setExecutor(new survival());
        getCommand("spectator").setExecutor(new spectator());
        getCommand("creative").setExecutor(new creative());
        getCommand("adventure").setExecutor(new adventure());


    }

    @Override
    public void onDisable() {
        System.out.println("Swapper 1.0 shutting down!");
    }
}
