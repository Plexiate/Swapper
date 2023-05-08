package me.plexiate.com.swapper.commands;

import me.plexiate.com.swapper.Msg;
import me.plexiate.com.swapper.Swapper;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class survival implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Msg.send(sender, "If I were to allow that; Would the server explode?...");
            return true;
        }

        Player player = (Player) sender;

        FileConfiguration config = Swapper.getInstance().getConfig();
        String pluginprefix = config.getString("prefix");
        String survivalmsg = config.getString("messages.survival");

        player.setGameMode(GameMode.SURVIVAL);
        Msg.send(sender, pluginprefix + survivalmsg);

        return true;
    }
}
