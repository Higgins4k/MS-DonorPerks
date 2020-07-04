//package xyz.minestory.donorperks.guis;
//
//import org.bukkit.Bukkit;
//import org.bukkit.ChatColor;
//import org.bukkit.Material;
//import org.bukkit.entity.Player;
//import org.bukkit.event.EventHandler;
//import org.bukkit.event.Listener;
//import org.bukkit.event.inventory.InventoryClickEvent;
//import org.bukkit.inventory.Inventory;
//import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.meta.ItemMeta;
//import xyz.minestory.donorperks.DonorPerksPlugin;
//
//public class StoryGUI implements Listener {
//    private DonorPerksPlugin plugin;
//    public StoryGUI(DonorPerksPlugin plugin){
//        this.plugin = plugin;
//
//        Bukkit.getPluginManager().registerEvents(this, plugin);
//    }
//
//    public static Inventory StoryInventory = Bukkit.createInventory(null, 9, "Story Perks and Rewards");
//    private static Inventory StoryPerks = Bukkit.createInventory(null, 9, "Story Perks");
//    private static Inventory StoryCommands = Bukkit.createInventory(null, 18, "Story Commands");
//
//
//
//
//
//    static {
//        ItemStack diamondblock = new ItemStack(Material.DIAMOND_BLOCK);
//        ItemMeta diamondblockm = diamondblock.getItemMeta();
//        diamondblockm.setDisplayName(ChatColor.GREEN + "Commands");
//        diamondblock.setItemMeta(diamondblockm);
//
//        ItemStack goldblock = new ItemStack(Material.GOLD_BLOCK);
//        ItemMeta goldblockm = goldblock.getItemMeta();
//        goldblockm.setDisplayName(ChatColor.YELLOW + "Perks");
//        goldblock.setItemMeta(goldblockm);
//
//        ItemStack purchase = new ItemStack(Material.BOOK);
//        ItemMeta pb = purchase.getItemMeta();
//        pb.setDisplayName(ChatColor.AQUA + "Buy now!");
//        purchase.setItemMeta(pb);
//
//        //commands start here
//        ItemStack enderchest = new ItemStack(Material.ENDER_CHEST);
//        ItemMeta em = enderchest.getItemMeta();
//        em.setDisplayName(ChatColor.LIGHT_PURPLE + "/enderchest");
//        enderchest.setItemMeta(em);
//
//        ItemStack feed = new ItemStack(Material.COOKED_BEEF);
//        ItemMeta fm = feed.getItemMeta();
//        fm.setDisplayName(ChatColor.LIGHT_PURPLE + "/feed");
//        feed.setItemMeta(fm);
//
//        ItemStack playertime = new ItemStack(Material.WATCH);
//        ItemMeta timem = playertime.getItemMeta();
//        timem.setDisplayName(ChatColor.LIGHT_PURPLE + "/playertime");
//        playertime.setItemMeta(timem);
//
//        ItemStack workbench = new ItemStack(Material.WORKBENCH);
//        ItemMeta wbm = workbench.getItemMeta();
//        wbm.setDisplayName(ChatColor.LIGHT_PURPLE + "/Workbench");
//        workbench.setItemMeta(wbm);
//
//        ItemStack pweather = new ItemStack(Material.YELLOW_FLOWER);
//        ItemMeta pweatherm = pweather.getItemMeta();
//        pweatherm.setDisplayName(ChatColor.LIGHT_PURPLE + "/pweather");
//        pweather.setItemMeta(pweatherm);
//
//        ItemStack fix = new ItemStack(Material.ANVIL);
//        ItemMeta fixm = fix.getItemMeta();
//        fixm.setDisplayName(ChatColor.LIGHT_PURPLE + "/fix");
//        fix.setItemMeta(fixm);
//
//        ItemStack fixall = new ItemStack(Material.ANVIL);
//        ItemMeta fixallm = fixall.getItemMeta();
//        fixallm.setDisplayName(ChatColor.LIGHT_PURPLE + "/fix all");
//        fixall.setItemMeta(fixallm);
//
//        ItemStack condense = new ItemStack(Material.HOPPER);
//        ItemMeta conm = condense.getItemMeta();
//        conm.setDisplayName(ChatColor.LIGHT_PURPLE + "/condense");
//        condense.setItemMeta(conm);
//
//        ItemStack fly = new ItemStack(Material.NAME_TAG);
//        ItemMeta flym = fly.getItemMeta();
//        flym.setDisplayName(ChatColor.LIGHT_PURPLE + "/fly");
//        fly.setItemMeta(flym);
//
//        ItemStack godmode = new ItemStack(Material.DIAMOND_CHESTPLATE);
//        ItemMeta godmodem = godmode.getItemMeta();
//        godmodem.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to /god");
//        godmode.setItemMeta(godmodem);
//
//        //Perks start here
//        ItemStack nebulakit = new ItemStack(Material.DIAMOND);
//        ItemMeta nkm = nebulakit.getItemMeta();
//        nkm.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to Nebula Kit");
//        nebulakit.setItemMeta(nkm);
//
//        ItemStack pv = new ItemStack(Material.ENDER_CHEST);
//        ItemMeta pv8 = pv.getItemMeta();
//        pv8.setDisplayName(ChatColor.LIGHT_PURPLE + "Access to 8 Player Vaults");
//        pv.setItemMeta(pv8);
//
//        ItemStack homes = new ItemStack(Material.BED);
//        ItemMeta homesm = homes.getItemMeta();
//        homesm.setDisplayName(ChatColor.LIGHT_PURPLE + "30 homes");
//        homes.setItemMeta(homesm);
//
//        ItemStack csigns = new ItemStack(Material.SIGN);
//        ItemMeta csignsm = csigns.getItemMeta();
//        csignsm.setDisplayName(ChatColor.LIGHT_PURPLE + "Ability to use colored text on signs");
//        csigns.setItemMeta(csignsm);
//
//
//
//        StoryInventory.setItem(0, diamondblock);
//        StoryInventory.setItem(4, goldblock);
//        StoryInventory.setItem(8, purchase);
//        StoryCommands.setItem(0, enderchest);
//        StoryCommands.setItem(1, feed);
//        StoryCommands.setItem(2, playertime);
//        StoryCommands.setItem(3, workbench);
//        StoryCommands.setItem(4, pweather);
//        StoryCommands.setItem(5, fix);
//        StoryCommands.setItem(6, fixall);
//        StoryCommands.setItem(7, condense);
//        StoryCommands.setItem(8, fly);
//        StoryCommands.setItem(9, godmode);
//        StoryCommands.setItem(17, purchase);
//        StoryPerks.setItem(0, nebulakit);
//        StoryPerks.setItem(2, pv);
//        StoryPerks.setItem(4, homes);
//        StoryPerks.setItem(6, csigns);
//        StoryPerks.setItem(8, purchase);
//    }
//
//
//
//    @EventHandler
//    public void onInVentoryClick(InventoryClickEvent event){
//        Player player = (Player) event.getWhoClicked();
//        ItemStack clicked = event.getCurrentItem();
//        Inventory inventory = event.getInventory();
//        if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks and Rewards")){
//        e.setCancelled(true);
//                    if (e.getCurrentItem() == null) {
//                        return;
//                    }
//            if (clicked.getType() == Material.DIAMOND_BLOCK){
//                event.setCancelled(true);
//                player.closeInventory();
//                player.openInventory(StoryCommands);
//            }
//            if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks and Rewards")){
//        e.setCancelled(true);
//                    if (e.getCurrentItem() == null) {
//                        return;
//                    }
//                if (clicked.getType() == Material.GOLD_BLOCK){
//                    event.setCancelled(true);
//                    player.closeInventory();
//                    player.openInventory(StoryPerks);
//                }
//            }
//            if (event.getView().getTitle().equalsIgnoreCase("Nebula Perks and Rewards")){
//        e.setCancelled(true);
//                    if (e.getCurrentItem() == null) {
//                        return;
//                    }
//                if (clicked.getType() == Material.BOOK){
//                    event.setCancelled(true);
//                    player.sendMessage(ChatColor.BLUE + "You can purchase the Story Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
//                    player.closeInventory();
//                }
//            }
//        }
//        if (event.getView().getTitle().equalsIgnoreCase("Story Commands")){
//        e.setCancelled(true);
//                    if (e.getCurrentItem() == null) {
//                        return;
//                    }
//            if (clicked.getType() == Material.BOOK){
//                event.setCancelled(true);
//                player.sendMessage(ChatColor.BLUE + "You can purchase the Story Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
//                player.closeInventory();
//            }else {
//                event.setCancelled(true);
//            }
//        }
//        if (event.getView().getTitle().equalsIgnoreCase("Story Perks")){
//        e.setCancelled(true);
//                    if (e.getCurrentItem() == null) {
//                        return;
//                    }
//            if (clicked.getType() == Material.BOOK){
//                event.setCancelled(true);
//                player.sendMessage(ChatColor.BLUE + "You can purchase the Story Rank here" + ChatColor.AQUA + " shop.minestory.xyz");
//                player.closeInventory();
//            }else{
//                event.setCancelled(true);
//            }
//        }
//    }
//
//
//
//
//
//
//
//
//}
