package me.vazguild.myst_general.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vazguild.myst_general.Utils;

public class HELP implements CommandExecutor {
    
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
    	Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("help")) {
        	if(player.hasPermission("myst.help")) {
            if (sender instanceof Player) {
            	// Sends message
                Utils.send(player, "&8&m----------&aMyst&8&m----------");
                Utils.send(player, "&8- &aMsg &7Messages an Online Player.");
                Utils.send(player, "&8- &aBal &7Checks your Balance. ");
                Utils.send(player, "&8- &aTpa &7Sends a TP request to a Player. ");
                Utils.send(player, "&8- &aTpaccept &7Accepts a teleport request. ");
                Utils.send(player, "&8- &aHome &7Teleports you to your Home. ");
                Utils.send(player, "&8- &aSpawn &7Teleports you to Spawn. ");
                Utils.send(player, "&8&m----------&aHelp&8&m----------");
            } else {
                sender.sendMessage("Only players can use this command!");
                return true;
            	}
        	}
        }
		return false;
    }
}
