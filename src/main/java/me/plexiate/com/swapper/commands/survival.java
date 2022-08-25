package me.plexiate.com.swapper.commands;

import me.plexiate.com.swapper.Msg;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class survival implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Msg.send(sender, "If I were to allow that; Would the server explode?...");
            return true;
        }

        Player player = (Player) sender;
        player.setGameMode(GameMode.SURVIVAL);
        Msg.send(sender, "&8[&cSwapper&8] &7Gamemode set to &eSurvival&7.");

        return true;
    }
}
