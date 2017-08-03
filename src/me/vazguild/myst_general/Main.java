package me.vazguild.myst_general;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.vazguild.myst_general.commands.TIME;
import me.vazguild.myst_general.commands.TIMEDAY;
import me.vazguild.myst_general.commands.TIMENIGHT;
import me.vazguild.myst_general.commands.TP;

public class Main extends JavaPlugin {
	
	public HashMap <Player, Player> lastmsg = new HashMap<Player, Player>();
	
	@Override
	public void onEnable() {
		
		// Activation message.
		getServer().getLogger().info("Myst-General has been activated.");
		
		// Registering listeners.
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		
		// Registering commands.
        this.getCommand("day").setExecutor(new TIMEDAY());
        this.getCommand("night").setExecutor(new TIMENIGHT());
        this.getCommand("time").setExecutor(new TIME());
        this.getCommand("tp").setExecutor(new TP());
	}
	@Override
	public void onDisable() {
		
		// Deactivation message.
		getServer().getLogger().info("Myst-General has been deactivated.");
		
	}

}
