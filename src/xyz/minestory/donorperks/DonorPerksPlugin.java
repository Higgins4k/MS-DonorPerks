package xyz.minestory.donorperks;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.minestory.donorperks.commands.*;
import xyz.minestory.donorperks.guis.*;

public class DonorPerksPlugin extends JavaPlugin {


    @Override
    public void onEnable() {
        registerCommands();
        new NebulaGUI(this);
        new GalacticGUI(this);
        new CosmicGUI(this);
        new SolarGUI(this);
        new StoryGUI(this);
        new StarGUI(this);


    }

    private void registerCommands() {
        this.getCommand("NebulaPerk").setExecutor(new NebulaPerkCommand());
        this.getCommand("GalacticPerk").setExecutor(new GalacticPerkCommand());
        this.getCommand("CosmicPerk").setExecutor(new CosmicPerkCommand());
        this.getCommand("SolarPerk").setExecutor(new SolarPerkCommand());
        this.getCommand("StoryPerk").setExecutor(new StoryPerkCommand());
        this.getCommand("StarPerk").setExecutor(new StarPerkCommand());


    }


    @Override
    public void onDisable() {

    }



}
