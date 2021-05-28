package me.bmt.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.bmt.main.Main;

//Gemaakt door CASJEKEN

public class PlayerListeners implements Listener{
	
	Main plugin;
	public PlayerListeners(Main instance) {
		this.plugin = instance;
		
	}
	//Member joint
	@EventHandler
	public void PlayerJoin(PlayerJoinEvent e) {
	  Player p = e.getPlayer();
	  String pname = p.getName();
	  p.getInventory().clear();
	  Bukkit.broadcastMessage("" + ChatColor.RED + ChatColor.WHITE + "BMT | " + pname + ChatColor.RESET + "is de Server gejoint!");	
	  
	  //Kit selector
	  ItemStack kitselector = new ItemStack(Material.COMPASS);
	  ItemMeta m = kitselector.getItemMeta();
	  m.setDisplayName(ChatColor.GOLD + "Kies je kit");
	  kitselector.setItemMeta(m);
	  p.getInventory().setItem(4,  kitselector);
	  }
	
	//member leaved de server
	@EventHandler
	public void Playerleave(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		String pname = p.getName();
		p.getInventory().clear();
		  Bukkit.broadcastMessage("" + ChatColor.RED + ChatColor.WHITE + "BMT | " + pname + ChatColor.RESET + "Heeft de server verlaten!" + "");
	}
		  
		  
    @EventHandler  
    public void Death(PlayerDeathEvent e) {
    	
    	Player p = e.getEntity();
    	Player k = p.getKiller();
    	e.getDrops().clear(); 
    	e.setDeathMessage("" + ChatColor.RED + ChatColor.WHITE + "BMT | " + e.getEntity() +" is Vermoord door " + ChatColor.RESET  + p.getKiller());
        p.sendMessage(ChatColor.RED + "Jij bent Vermoord door" + ChatColor.DARK_RED + k.getName() ); }
         
        
        @EventHandler
        public void Respawn(PlayerRespawnEvent e) {
        	Player p = e.getPlayer();
        	  
        	ItemStack kitselector = new ItemStack(Material.COMPASS);
        	  ItemMeta m = kitselector.getItemMeta();
        	  m.setDisplayName(ChatColor.GOLD + "Kies je kit");
        	  kitselector.setItemMeta(m);
        	  p.getInventory().setItem(4,  kitselector);
        	  
        	  
        	  }
        	
        	
        	
        	
        	
        	
        	
        
        	
        	
        	
        
        {
    
    			
    	
    	
    
		
		
	}
	

}
		
	


