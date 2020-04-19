package xyz.minestory.donorperks.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.minestory.donorperks.DonorPerksPlugin;

public class CosmicGUI implements Listener {
    private DonorPerksPlugin plugin;
    public CosmicGUI(DonorPerksPlugin plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public static Inventory CosmicInventory = Bukkit.createInventory(null, 9, "Cosmic Perks and Rewards");
    private static Inventory CosmicCommands = Bukkit.createInventory(null, 18, "Cosmic Commands");
    private static Inventory CosmicPerks = Bukkit.createInventory(null, 9, "Cosmic Perks");


    static {
        ItemStack diamondblock = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta diamondblockm = diamondblock.getItemMeta();
        diamondblockm.setDisplayName(ChatColor.GREEN + "Commands");
        diamondblock.setItemMeta(diamondblockm);

        ItemStack goldblock = new ItemStack(Material.GOLD_BLOCK);
        ItemMeta goldblockm = goldblock.getItemMeta();
        goldblockm.setDisplayName(ChatColor.YELLOW + "Perks");
        goldblock.setItemMeta(goldblockm);

        ItemStack purchase = new ItemStack(Material.BOOK);
        ItemMeta pb = purchase.getItemMeta();
        pb.setDisplayName(ChatColor.AQUA + "Buy now!");
        purchase.setItemMeta(pb);

        //commands start here
        ItemStack enderchest = new ItemStack(Material.ENDER_CHEST);
        ItemMeta em = enderchest.getItemMeta();
        em.setDisplayName(ChatColor.LIGHT_PURPLE + "/enderchest");
        enderchest.setItemMeta(em);

        ItemStack feed = new ItemStack(Material.COOKED_BEEF);
        ItemMeta fm = feed.getItemMeta();
        fm.setDisplayName(ChatColor.LIGHT_PURPLE + "/feed");
        feed.setItemMeta(fm);

        ItemStack playertime = new ItemStack(Material.WATCH);
        ItemMeta timem = playertime.getItemMeta();
        timem.setDisplayName(ChatColor.LIGHT_PURPLE + "/playertime");
        playertime.setItemMeta(timem);

        ItemStack workbench = new ItemStack(Material.WORKBENCH);
        ItemMeta wbm = workbench.getItemMeta();
        wbm.setDisplayName(ChatColor.LIGHT_PURPLE + "/Workbench");
        workbench.setItemMeta(wbm);

        ItemStack pweather = new ItemStack(Material.YELLOW_FLOWER);
        ItemMeta pweatherm = pweather.getItemMeta();
        pweatherm.setDisplayName(ChatColor.LIGHT_PURPLE + "/pweather");
        pweather.setItemMeta(pweatherm);

        ItemStack fix = new ItemStack(Material.ANVIL);
        ItemMeta fixm = fix.getItemMeta();
        fixm.setDisplayName(ChatColor.LIGHT_PURPLE + "/fix");
        fix.setItemMeta(fixm);

        //Perks start here
        ItemStack cosmickit = new ItemStack(Material.DIAMOND);
        ItemMeta ckm = cosmickit.getItemMeta();
        ckm.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to Cosmic Kit");
        cosmickit.setItemMeta(ckm);

        ItemStack pv = new ItemStack(Material.ENDER_CHEST);
        ItemMeta pv7 = pv.getItemMeta();
        pv7.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to 6 Player Vaults");
        pv.setItemMeta(pv7);

        ItemStack homes = new ItemStack(Material.BED);
        ItemMeta homesm = homes.getItemMeta();
        homesm.setDisplayName(ChatColor.LIGHT_PURPLE + "20 homes");
        homes.setItemMeta(homesm);

        ItemStack csigns = new ItemStack(Material.SIGN);
        ItemMeta csignsm = csigns.getItemMeta();
        csignsm.setDisplayName(ChatColor.LIGHT_PURPLE + "Ability to use colored text on signs");
        csigns.setItemMeta(csignsm);

        CosmicInventory.setItem(0, diamondblock);
        CosmicInventory.setItem(4, goldblock);
        CosmicInventory.setItem(8, purchase);
        CosmicCommands.setItem(0, enderchest);
        CosmicCommands.setItem(1, feed);
        CosmicCommands.setItem(2, playertime);
        CosmicCommands.setItem(3, workbench);
        CosmicCommands.setItem(4, pweather);
        CosmicCommands.setItem(5, fix);
        CosmicCommands.setItem(8, purchase);
        CosmicPerks.setItem(0, cosmickit);
        CosmicPerks.setItem(2, pv);
        CosmicPerks.setItem(4, homes);
        CosmicPerks.setItem(6, csigns);
        CosmicPerks.setItem(8, purchase);



    }




    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        ItemStack clicked = event.getCurrentItem();
        Inventory inventory = event.getInventory();
        if (event.getView().getTitle().equalsIgnoreCase("Cosmic Perks and Rewards")){
            if (clicked.getType() == Material.DIAMOND_BLOCK){
                event.setCancelled(true);
                player.closeInventory();
                player.openInventory(CosmicCommands);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Cosmic Perks and Rewards")){
            if (clicked.getType() == Material.GOLD_BLOCK){
                event.setCancelled(true);
                player.closeInventory();
                player.openInventory(CosmicPerks);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Cosmic Perks and Rewards")){
            if (clicked.getType() == Material.BOOK){
                event.setCancelled(true);
                player.sendMessage(ChatColor.BLUE + "You can purchase the Cosmic Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
                player.closeInventory();
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Cosmic Commands")){
            if (clicked.getType() == Material.BOOK){
             player.sendMessage(ChatColor.BLUE + "You can purchase the Cosmic Rank here" + ChatColor.AQUA + "shop.minestory.xyz");
            }else {
                event.setCancelled(true);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Cosmic Perks")){
            if (clicked.getType() == Material.BOOK){
                player.sendMessage(ChatColor.BLUE + "You can purchase the Cosmic Rank here" + ChatColor.AQUA + "shop.minestory.xyz");
            }else {
                event.setCancelled(true);
            }
        }


    }



}



