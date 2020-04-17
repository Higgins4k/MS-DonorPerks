package xyz.minestory.donorperks;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.minestory.donorperks.commands.CosmicPerkCommand;
import xyz.minestory.donorperks.commands.GalacticPerkCommand;
import xyz.minestory.donorperks.commands.NebulaPerkCommand;
import xyz.minestory.donorperks.commands.SolarPerkCommand;
import xyz.minestory.donorperks.guis.CosmicGUI;
import xyz.minestory.donorperks.guis.GalacticGUI;
import xyz.minestory.donorperks.guis.NebulaGUI;
import xyz.minestory.donorperks.guis.SolarGUI;

public class DonorPerksPlugin extends JavaPlugin {


    @Override
    public void onEnable() {
        registerCommands();
        new NebulaGUI(this);
        new GalacticGUI(this);
        new CosmicGUI(this);
        new SolarGUI(this);


    }

    private void registerCommands() {
        this.getCommand("NebulaPerk").setExecutor(new NebulaPerkCommand());
        this.getCommand("GalacticPerk").setExecutor(new GalacticPerkCommand());
        this.getCommand("CosmicPerk").setExecutor(new CosmicPerkCommand());
        this.getCommand("SolarPerk").setExecutor(new SolarPerkCommand());


    }


    @Override
    public void onDisable() {

    }



}
