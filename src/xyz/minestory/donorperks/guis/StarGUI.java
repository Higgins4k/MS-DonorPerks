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

public class StarGUI implements Listener {
    private DonorPerksPlugin plugin;
    public StarGUI(DonorPerksPlugin plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public static Inventory StarInventory = Bukkit.createInventory(null, 9, "Star Perks and Rewards");
    private static Inventory StarCommands = Bukkit.createInventory(null, 18, "Star Commands");
    private static Inventory StarPerks = Bukkit.createInventory(null, 9, "Star Perks");


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

        ItemStack playertime = new ItemStack(Material.CLOCK);
        ItemMeta timem = playertime.getItemMeta();
        timem.setDisplayName(ChatColor.LIGHT_PURPLE + "/playertime");
        playertime.setItemMeta(timem);

        ItemStack workbench = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta wbm = workbench.getItemMeta();
        wbm.setDisplayName(ChatColor.LIGHT_PURPLE + "/Workbench");
        workbench.setItemMeta(wbm);

        //Perks start here
        ItemStack cosmickit = new ItemStack(Material.DIAMOND);
        ItemMeta ckm = cosmickit.getItemMeta();
        ckm.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to Star Kit");
        cosmickit.setItemMeta(ckm);

        ItemStack pv = new ItemStack(Material.ENDER_CHEST);
        ItemMeta pv7 = pv.getItemMeta();
        pv7.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to 4 Player Vaults");
        pv.setItemMeta(pv7);

        ItemStack homes = new ItemStack(Material.RED_BED);
        ItemMeta homesm = homes.getItemMeta();
        homesm.setDisplayName(ChatColor.LIGHT_PURPLE + "10 homes");
        homes.setItemMeta(homesm);

        ItemStack csigns = new ItemStack(Material.OAK_SIGN);
        ItemMeta csignsm = csigns.getItemMeta();
        csignsm.setDisplayName(ChatColor.LIGHT_PURPLE + "Ability to use colored text on signs");
        csigns.setItemMeta(csignsm);

        StarInventory.setItem(0, diamondblock);
        StarInventory.setItem(4, goldblock);
        StarInventory.setItem(8, purchase);
        StarCommands.setItem(0, enderchest);
        StarCommands.setItem(1, feed);
        StarCommands.setItem(2, playertime);
        StarCommands.setItem(3, workbench);
        StarCommands.setItem(8, purchase);
        StarPerks.setItem(0, cosmickit);
        StarPerks.setItem(2, pv);
        StarPerks.setItem(4, homes);
        StarPerks.setItem(6, csigns);
        StarPerks.setItem(8, purchase);



    }




    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        ItemStack clicked = event.getCurrentItem();
        Inventory inventory = event.getInventory();
        if (event.getView().getTitle().equalsIgnoreCase("Star Perks and Rewards")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
            if (clicked.getType() == Material.DIAMOND_BLOCK){
                event.setCancelled(true);
                player.closeInventory();
                player.openInventory(StarCommands);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Star Perks and Rewards")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
            if (clicked.getType() == Material.GOLD_BLOCK){
                event.setCancelled(true);
                player.closeInventory();
                player.openInventory(StarPerks);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Star Perks and Rewards")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
            if (clicked.getType() == Material.BOOK){
                event.setCancelled(true);
                player.sendMessage(ChatColor.BLUE + "You can purchase the Star Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
                player.closeInventory();
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Star Commands")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase("Star Perks")){
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
            event.setCancelled(true);
        }


    }









}
