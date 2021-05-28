package me.bmt.main;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import me.bmt.listeners.PlayerListeners;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public void log(String sting) {
		System.out.println(sting);
	}
	
	public static Main getInstance() {
		return instance;
		
	}
	
	public void registerListeners(){
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerListeners(this), this);
	
		//Gemaakt door CASJEKEN
		
	}
 public void registerCommands() {	
}
 //waneer plugin aan staat
 @Override
 public void onEnable() {	
	 getLogger().info("Aanzetten geslaagd!");
	 instance = this;
	 registerListeners();
	 registerCommands();
 }
//als de plugin uit staat
 @Override
 public void onDisable(){
	 getLogger().info("Uitzetten geslaagd!");
	 instance = null;
	 
 }
 
 //Commands

public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
	 
	 //Starter kit
  if (cmd.getName().equalsIgnoreCase("Starter") && sender instanceof Player) {
	 
	 Player p = (Player) sender;
	 p.getInventory().clear();
	 ItemStack Starterboog = new ItemStack(Material.BOW);
	 ItemMeta m = Starterboog.getItemMeta();
	 m.setDisplayName("" + ChatColor.YELLOW + ChatColor.GOLD + "Starter Boog");
	 Starterboog.setItemMeta(m);
	 Starterboog.addEnchantment(Enchantment.DURABILITY, 1);
	 Starterboog.addEnchantment(Enchantment.ARROW_INFINITE, 1);
	 p.getInventory().addItem(Starterboog);
	 p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
	 p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
	 p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
	 p.getInventory().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
	 p.getInventory().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
	 p.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
	 p.getInventory().addItem(new ItemStack(Material.APPLE, 15));
	 p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 2));
	 p.sendMessage("" + ChatColor.RED + ChatColor.WHITE + "BMT | Kit Ontvangen!");
	 
	//Gemaakt door CASJEKEN
			 
	 //Archer kit
	 if (cmd.getName().equalsIgnoreCase("Archer") && sender instanceof Player) {
		 
	 }
	 p.getInventory().clear();
	 ItemStack ArcherBoog = new ItemStack(Material.BOW);
	 ItemMeta n = ArcherBoog.getItemMeta();
	 n.setDisplayName("" + ChatColor.YELLOW + ChatColor.GOLD + "Archer Boog");
	 ArcherBoog.setItemMeta(m);
	 ArcherBoog.addEnchantment(Enchantment.DURABILITY, 1);
	 ArcherBoog.addEnchantment(Enchantment.ARROW_INFINITE, 1);
	 ArcherBoog.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
	 ArcherBoog.addEnchantment(Enchantment.ARROW_FIRE, 1);
	 p.getInventory().addItem(ArcherBoog);
	 p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
	 p.getInventory().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
	 p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
	 p.getInventory().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
	 p.getInventory().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
	  ItemStack ArcherZwaard = new ItemStack(Material.WOODEN_SWORD);
	 ItemMeta z = ArcherZwaard.getItemMeta();
	 z.setDisplayName("" + ChatColor.YELLOW + ChatColor.GOLD + "Archer Zwaard");
	 p.getInventory().addItem(ArcherZwaard);
	 p.getInventory().addItem(new ItemStack(Material.APPLE, 15));
	 p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 2));
	 p.sendMessage("" + ChatColor.RED + ChatColor.WHITE + "BMT | Kit Ontvangen!");
	
	
	 
	 }
	 
  //Magic kit 
  if (cmd.getName().equalsIgnoreCase("Magic") && sender instanceof Player) {
		 
	 
     Player p = (Player) sender;
	 p.getInventory().clear();
	 ItemStack Magicw = new ItemStack(Material.STICK);
	 ItemMeta w = Magicw.getItemMeta();
	 w.setDisplayName("" + ChatColor.YELLOW + ChatColor.GOLD + "ToverStok");
	 Magicw.setItemMeta(w);
	 Magicw.addEnchantment(Enchantment.DURABILITY, 1);
	 Magicw.addEnchantment(Enchantment.KNOCKBACK, 2);
	 Magicw.addEnchantment(Enchantment.DAMAGE_ALL, 2);
	 Magicw.addEnchantment(Enchantment.FIRE_ASPECT, 1);
	 p.getInventory().addItem(Magicw);
	 p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
	 p.getInventory().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
	 p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
	 p.getInventory().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
	 p.getInventory().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
	  ItemStack ArcherZwaard = new ItemStack(Material.POTION);
	 ItemMeta z = ArcherZwaard.getItemMeta();
	 z.setDisplayName("" + ChatColor.YELLOW + ChatColor.GOLD + "Gif Drankje");
	 p.getInventory().addItem(ArcherZwaard);
	 p.getInventory().addItem(new ItemStack(Material.APPLE, 15));
	 p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 2));
	 p.sendMessage("" + ChatColor.RED + ChatColor.WHITE + "BMT | Kit Ontvangen!");
				 
	 
	 
	 
  }
	 
	 return false;
	 
	 
 }
 
 
  } 
  
 
  
 
