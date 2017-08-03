package me.vazguild.myst_general;

import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils {
	
	public static void send(Player player, String msg) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));

    }

    public static void log(Level level, String msg) {
        System.out.println("Myst " + msg);
    }

}
