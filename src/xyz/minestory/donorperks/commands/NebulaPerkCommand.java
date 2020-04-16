package xyz.minestory.donorperks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.minestory.donorperks.guis.NebulaGUI;

public class NebulaPerkCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (commandSender instanceof Player){
            player.openInventory(NebulaGUI.NebulaInventory);
        return true;
        }else{
            commandSender.sendMessage("Do not run this from console");
        }
        return true;
    }
}
