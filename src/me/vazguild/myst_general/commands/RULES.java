package me.vazguild.myst_general.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vazguild.myst_general.Utils;

public class RULES implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
    	Player player = (Player) sender;
    	if (player.hasPermission("myst.rules")) {
    		if (cmd.getName().equalsIgnoreCase("rules")) {
    			if (sender instanceof Player) {
    				// Sends message
    				Utils.send(player, "&8&m----------&aMyst&8&m----------");
    				Utils.send(player, "&8- &7Don't &aSpam&7.");
    				Utils.send(player, "&8- &7Don't be &aDisrespectful&7.");
    				Utils.send(player, "&8- &7Try not to cause &aLag &7on the server.");
    				Utils.send(player, "&8- &7No &aServer Threats &7 of Any Kind.");
    				Utils.send(player, "&8- &7No use of &aExploits&7.");
    				Utils.send(player, "&8- &7No &aX-Ray &7");
    				Utils.send(player, "&8&m----------&aRules&8&m---------");
    				return true;
            	}
        	}
    	}
        return false;
    }
}
