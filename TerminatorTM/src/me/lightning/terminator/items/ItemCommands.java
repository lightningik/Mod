package me.lightning.terminator.items;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ItemCommands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Ingame only!!!");
            return false;
        }
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("term")) {
            player.getInventory().addItem(itemManager.Terminator);
            player.getInventory().addItem(itemManager.Telewand);
        }

        return true;
    }

}
