package xyz.minestory.donorperks.skyblock.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.minestory.donorperks.skyblock.guis.MartianGUI;

public class MartianCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (commandSender instanceof Player){
            player.openInventory(MartianGUI.MartianInventory);
            return true;
        }else{
            commandSender.sendMessage("Do not run this from console");
        }
        return true;
    }
}
