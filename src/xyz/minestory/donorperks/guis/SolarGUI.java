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

public class SolarGUI implements Listener {
    private DonorPerksPlugin plugin;
    public SolarGUI(DonorPerksPlugin plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public static Inventory SolarInventory = Bukkit.createInventory(null, 9, "Solar Perks and Rewards");
    private static Inventory SolarCommands = Bukkit.createInventory(null, 18, "Solar Commands");
    private static Inventory SolarPerks = Bukkit.createInventory(null, 9, "Solar Perks");


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

        //Perks start here
        ItemStack cosmickit = new ItemStack(Material.DIAMOND);
        ItemMeta ckm = cosmickit.getItemMeta();
        ckm.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to Solar Kit");
        cosmickit.setItemMeta(ckm);

        ItemStack pv = new ItemStack(Material.ENDER_CHEST);
        ItemMeta pv7 = pv.getItemMeta();
        pv7.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to 5 Player Vaults");
        pv.setItemMeta(pv7);

        ItemStack homes = new ItemStack(Material.BED);
        ItemMeta homesm = homes.getItemMeta();
        homesm.setDisplayName(ChatColor.LIGHT_PURPLE + "15 homes");
        homes.setItemMeta(homesm);

        ItemStack csigns = new ItemStack(Material.SIGN);
        ItemMeta csignsm = csigns.getItemMeta();
        csignsm.setDisplayName(ChatColor.LIGHT_PURPLE + "Ability to use colored text on signs");
        csigns.setItemMeta(csignsm);

        SolarInventory.setItem(0, diamondblock);
        SolarInventory.setItem(4, goldblock);
        SolarInventory.setItem(8, purchase);
        SolarCommands.setItem(0, enderchest);
        SolarCommands.setItem(1, feed);
        SolarCommands.setItem(2, playertime);
        SolarCommands.setItem(3, workbench);
        SolarCommands.setItem(4, pweather);
        SolarCommands.setItem(8, purchase);
        SolarPerks.setItem(0, cosmickit);
        SolarPerks.setItem(2, pv);
        SolarPerks.setItem(4, homes);
        SolarPerks.setItem(6, csigns);
        SolarPerks.setItem(8, purchase);



    }




    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        ItemStack clicked = event.getCurrentItem();
        Inventory inventory = event.getInventory();
        if (event.getView().getTitle().equalsIgnoreCase("Solar Perks and Rewards")){
            if (clicked.getType() == Material.DIAMOND_BLOCK){
                event.setCancelled(true);
                player.closeInventory();
                player.openInventory(SolarCommands);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Solar Perks and Rewards")){
            if (clicked.getType() == Material.GOLD_BLOCK){
                event.setCancelled(true);
                player.closeInventory();
                player.openInventory(SolarPerks);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Solar Perks and Rewards")){
            if (clicked.getType() == Material.BOOK){
                event.setCancelled(true);
                player.sendMessage(ChatColor.BLUE + "You can purchase the Solar Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
                player.closeInventory();
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Solar Commands")){
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase("Solar Perks")){
            event.setCancelled(true);
        }


    }



}
