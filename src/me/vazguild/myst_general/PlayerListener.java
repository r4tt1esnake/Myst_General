package me.vazguild.myst_general;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
	
		Bukkit.getServer().getLogger().info(event.getPlayer().getName() + " has joined the server.");
		
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event) {
		
		Bukkit.getServer().getLogger().info(event.getPlayer().getName() + " has left the server.");
		
	}

}