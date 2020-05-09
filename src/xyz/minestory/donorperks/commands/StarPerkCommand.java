package xyz.minestory.donorperks.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.minestory.donorperks.guis.StarGUI;

public class StarPerkCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (commandSender instanceof Player){
            player.openInventory(StarGUI.StarInventory);
            return true;
        }else{
            commandSender.sendMessage(ChatColor.RED + "You should know the donor perks by now");
        }








        return false;
    }
}
