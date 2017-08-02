package me.vazguild.myst_general;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.vazguild.myst_general.commands.MESSAGE;

public class Main extends JavaPlugin {
	
	public HashMap <Player, Player> lastmsg = new HashMap<Player, Player>();
	
	@Override
	public void onEnable() {
		
		// Activation message.
		getServer().getLogger().info("Myst-General has been activated.");
		
		// Registering listeners.
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		
		// Registering commands.
		this.getCommand("tp").setExecutor(new MESSAGE());
		
	}
	
	@Override
	public void onDisable() {
		
		// Deactivation message.
		getServer().getLogger().info("Myst-General has been deactivated.");
		
	}

}
