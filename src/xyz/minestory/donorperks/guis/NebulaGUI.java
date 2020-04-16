package xyz.minestory.donorperks.guis;

import net.minecraft.server.v1_7_R4.EntityVillager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.minestory.donorperks.DonorPerksPlugin;

public class NebulaGUI implements Listener {

    private DonorPerksPlugin plugin;
    public NebulaGUI(DonorPerksPlugin plugin){
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public static Inventory NebulaInventory = Bukkit.createInventory(null, 9, "Nebula Perks and Rewards");
    private static Inventory NebulaPerks = Bukkit.createInventory(null, 9, "Nebula Perks");
    private static Inventory NebulaCommands = Bukkit.createInventory(null, 18, "Nebula Commands");


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

        ItemStack fixall = new ItemStack(Material.ANVIL);
        ItemMeta fixallm = fixall.getItemMeta();
        fixallm.setDisplayName(ChatColor.LIGHT_PURPLE + "/fix all");
        fix.setItemMeta(fixallm);

        ItemStack condense = new ItemStack(Material.HOPPER);
        ItemMeta conm = condense.getItemMeta();
        conm.setDisplayName(ChatColor.LIGHT_PURPLE + "/condense");
        condense.setItemMeta(conm);

        ItemStack fly = new ItemStack(Material.NAME_TAG);
        ItemMeta flym = fly.getItemMeta();
        flym.setDisplayName(ChatColor.LIGHT_PURPLE + "/fly");
        fly.setItemMeta(flym);

        ItemStack godmode = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta godmodem = godmode.getItemMeta();
        godmodem.setDisplayName("Access to /god");
        godmode.setItemMeta(godmodem);

        //Perks start here
        ItemStack nebulakit = new ItemStack(Material.DIAMOND);
        ItemMeta nkm = nebulakit.getItemMeta();
        nkm.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to Nebula Kit");
        nebulakit.setItemMeta(nkm);

        ItemStack pv = new ItemStack(Material.ENDER_CHEST);
        ItemMeta pv8 = pv.getItemMeta();
        pv8.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to 8 Player Vaults");
        pv.setItemMeta(pv8);

        ItemStack homes = new ItemStack(Material.BED);
        ItemMeta homesm = homes.getItemMeta();
        homesm.setDisplayName(ChatColor.LIGHT_PURPLE + "30 homes");
        homes.setItemMeta(homesm);

        ItemStack csigns = new ItemStack(Material.SIGN);
        ItemMeta csignsm = csigns.getItemMeta();
        csignsm.setDisplayName(ChatColor.LIGHT_PURPLE + "Ability to use colored text on signs");
        csigns.setItemMeta(csignsm);



        NebulaInventory.setItem(0, diamondblock);
        NebulaInventory.setItem(4, goldblock);
        NebulaInventory.setItem(8, purchase);
        NebulaCommands.setItem(0, enderchest);
        NebulaCommands.setItem(1, feed);
        NebulaCommands.setItem(2, playertime);
        NebulaCommands.setItem(3, workbench);
        NebulaCommands.setItem(4, pweather);
        NebulaCommands.setItem(5, fix);
        NebulaCommands.setItem(6, fixall);
        NebulaCommands.setItem(7, condense);
        NebulaCommands.setItem(8, fly);
        NebulaCommands.setItem(9, godmode);
        NebulaPerks.setItem(0, nebulakit);
        NebulaPerks.setItem(2, pv);
        NebulaPerks.setItem(4, homes);
        NebulaPerks.setItem(6, csigns);

    }



    @EventHandler
    public void onInVentoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        ItemStack clicked = event.getCurrentItem();
        Inventory inventory = event.getInventory();
        if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks and Rewards")){
            if (clicked.getType() == Material.DIAMOND_BLOCK){
                event.setCancelled(true);
                player.closeInventory();
                player.openInventory(NebulaCommands);
            }
            if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks and Rewards")){
                if (clicked.getType() == Material.GOLD_BLOCK){
                    event.setCancelled(true);
                    player.closeInventory();
                    player.openInventory(NebulaPerks);
                }
            }
            if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks and Rewards")){
                if (clicked.getType() == Material.BOOK){
                    player.sendMessage(ChatColor.BLUE + "You can purchase the Nebula Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
                    player.closeInventory();
                }
            }
            if (event.getView().getTitle().equalsIgnoreCase("Nebula Commands")){
                event.setCancelled(true);
            }
        }
    }




}
