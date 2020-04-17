package xyz.minestory.donorperks;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.minestory.donorperks.commands.NebulaPerkCommand;
import xyz.minestory.donorperks.guis.GalacticGUI;
import xyz.minestory.donorperks.guis.NebulaGUI;

public class DonorPerksPlugin extends JavaPlugin {


    @Override
    public void onEnable() {
        registerCommands();
        new NebulaGUI(this);
        new GalacticGUI(this);


    }

    private void registerCommands() {
        this.getCommand("NebulaPerk").setExecutor(new NebulaPerkCommand());


    }


    @Override
    public void onDisable() {

    }



}
