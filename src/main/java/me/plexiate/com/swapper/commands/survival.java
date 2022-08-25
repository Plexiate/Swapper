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
            Msg.send(sender, "10 IQ points have been deducted.");
            return true;
        }

        Player player = (Player) sender;
        player.setGameMode(GameMode.SURVIVAL);
        Msg.send(sender, "&8[&aCrafters&8] &fGamemode set to &eSurvival&f.");

        return true;
    }
}
