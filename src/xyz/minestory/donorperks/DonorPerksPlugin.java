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
        //new StoryGUI(this);
        new StarGUI(this);
        new FlareGUI(this);

        saveDefaultConfig();


    }

    private void registerCommands() {
        if (getConfig().getBoolean("survival")) {
            this.getCommand("NebulaPerk").setExecutor(new NebulaPerkCommand());
            this.getCommand("GalacticPerk").setExecutor(new GalacticPerkCommand());
            this.getCommand("CosmicPerk").setExecutor(new CosmicPerkCommand());
            this.getCommand("SolarPerk").setExecutor(new SolarPerkCommand());
        this.getCommand("StoryPerk").setExecutor(new StoryPerkCommand());
            this.getCommand("StarPerk").setExecutor(new StarPerkCommand());
            this.getCommand("FlarePerk").setExecutor(new FlarePerkCommand());
        }

        if (getConfig().getBoolean("skyblock")){
            //nothing yet
        }

    }


    @Override
    public void onDisable() {

    }



}
