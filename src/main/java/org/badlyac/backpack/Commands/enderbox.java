package org.badlyac.backpack.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class enderbox implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.openInventory(player.getEnderChest());
            return true;
        } else {
            commandSender.sendMessage("This command can only be used by player");
            return false;
        }
    }
}
