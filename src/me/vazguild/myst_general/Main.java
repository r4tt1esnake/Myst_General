package me.vazguild.myst_general;

import org.bukkit.plugin.java.JavaPlugin;

import me.vazguild.myst_general.commands.TP;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		// Activation message.
		getServer().getLogger().info("Myst-General has been activated.");
		
		// Registering listeners.
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		
		// Registering commands.
		this.getCommand("tp").setExecutor(new TP());
		
	}
	
	@Override
	public void onDisable() {
		
		// Deactivation message.
		getServer().getLogger().info("Myst-General has been deactivated.");
		
	}

}
