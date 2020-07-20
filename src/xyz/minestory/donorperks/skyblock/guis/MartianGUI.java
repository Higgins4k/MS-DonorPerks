package xyz.minestory.donorperks.skyblock.guis;

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

public class MartianGUI implements Listener {
    private DonorPerksPlugin plugin;
    public MartianGUI(DonorPerksPlugin plugin){
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }


    public static Inventory MartianInventory = Bukkit.createInventory(null, 9, "Martian Perks and Rewards");
    private static Inventory MartianPerks = Bukkit.createInventory(null, 9, "Martian Perks");
    private static Inventory MartianCommands = Bukkit.createInventory(null, 18, "Martian Commands");


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
        wbm.setDisplayName(ChatColor.LIGHT_PURPLE + "/craft");
        workbench.setItemMeta(wbm);

        ItemStack pweather = new ItemStack(Material.POPPY);
        ItemMeta pweatherm = pweather.getItemMeta();
        pweatherm.setDisplayName(ChatColor.LIGHT_PURPLE + "/back");
        pweather.setItemMeta(pweatherm);

        ItemStack fix = new ItemStack(Material.ANVIL);
        ItemMeta fixm = fix.getItemMeta();
        fixm.setDisplayName(ChatColor.LIGHT_PURPLE + "/hat");
        fix.setItemMeta(fixm);

        ItemStack fixall = new ItemStack(Material.ANVIL);
        ItemMeta fixallm = fixall.getItemMeta();
        fixallm.setDisplayName(ChatColor.LIGHT_PURPLE + "/near");
        fixall.setItemMeta(fixallm);

        ItemStack condense = new ItemStack(Material.HOPPER);
        ItemMeta conm = condense.getItemMeta();
        conm.setDisplayName(ChatColor.LIGHT_PURPLE + "/heal");
        condense.setItemMeta(conm);

        ItemStack fly = new ItemStack(Material.NAME_TAG);
        ItemMeta flym = fly.getItemMeta();
        flym.setDisplayName(ChatColor.LIGHT_PURPLE + "/fly");
        fly.setItemMeta(flym);

        ItemStack godmode = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta godmodem = godmode.getItemMeta();
        godmodem.setDisplayName(ChatColor.LIGHT_PURPLE + "/nick");
        godmode.setItemMeta(godmodem);

        //Perks start here
        ItemStack nebulakit = new ItemStack(Material.DIAMOND);
        ItemMeta nkm = nebulakit.getItemMeta();
        nkm.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to Martian Kit");
        nebulakit.setItemMeta(nkm);

        ItemStack pv = new ItemStack(Material.ENDER_CHEST);
        ItemMeta pv8 = pv.getItemMeta();
        pv8.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to 15 Player Vaults");
        pv.setItemMeta(pv8);

        ItemStack homes = new ItemStack(Material.RED_BED);
        ItemMeta homesm = homes.getItemMeta();
        homesm.setDisplayName(ChatColor.LIGHT_PURPLE + "15 homes");
        homes.setItemMeta(homesm);

        ItemStack itc = new ItemStack(Material.OAK_SIGN);
        ItemMeta itcm = itc.getItemMeta();
        itcm.setDisplayName(ChatColor.LIGHT_PURPLE + "Ability to display [item] in chat");
        itc.setItemMeta(itcm);



        MartianInventory.setItem(0, diamondblock);
        MartianInventory.setItem(4, goldblock);
        MartianInventory.setItem(8, purchase);
        MartianCommands.setItem(0, enderchest);
        MartianCommands.setItem(1, feed);
        MartianCommands.setItem(2, playertime);
        MartianCommands.setItem(3, workbench);
        MartianCommands.setItem(4, pweather);
        MartianCommands.setItem(5, fix);
        MartianCommands.setItem(6, fixall);
        MartianCommands.setItem(7, condense);
        MartianCommands.setItem(8, fly);
        MartianCommands.setItem(9, godmode);
        MartianCommands.setItem(17, purchase);
        MartianPerks.setItem(0, nebulakit);
        MartianPerks.setItem(2, pv);
        MartianPerks.setItem(4, homes);
        MartianPerks.setItem(6, itc);
        MartianPerks.setItem(8, purchase);
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
                player.openInventory(MartianCommands);
            }
            if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks and Rewards")){
                if (clicked.getType() == Material.GOLD_BLOCK){
                    event.setCancelled(true);
                    player.closeInventory();
                    player.openInventory(MartianPerks);
                }
            }
            if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks and Rewards")){
                if (clicked.getType() == Material.BOOK){
                    event.setCancelled(true);
                    player.sendMessage(ChatColor.BLUE + "You can purchase the Nebula Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
                    player.closeInventory();
                }
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Nebula Commands")){
            if (clicked.getType() == Material.BOOK){
                event.setCancelled(true);
                player.sendMessage(ChatColor.BLUE + "You can purchase the Nebula Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
                player.closeInventory();
            }else {
                event.setCancelled(true);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks")){
            if (clicked.getType() == Material.BOOK){
                event.setCancelled(true);
                player.sendMessage(ChatColor.BLUE + "You can purchase the Nebula Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
                player.closeInventory();
            }else{
                event.setCancelled(true);
            }
        }
    }




}
