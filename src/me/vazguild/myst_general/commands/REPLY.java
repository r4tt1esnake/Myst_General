package me.vazguild.myst_general.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vazguild.myst_general.Main;
import me.vazguild.myst_general.Utils;

public class REPLY implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(sender instanceof Player) {
				if(args.length == 0) {
					Utils.send(player, "&7Please specify a &aMessage&7!");
					return false;
				} else {
					Player target = main.lastmsg.get(player);
					if(target == null) {
						Utils.send(player, "&7That player is no longer &aOnline&7!");
						return false;
					}
					// Gets the message
					StringBuilder str = new StringBuilder();
					for (int i = 0; i < args.length; i++) {
						str.append(args[i] + " ");
					}
					// Sends the message to both players
					Utils.send(player, " &aMe &8» &a" + target.getName() + " &8» &7" + str.toString());
					Utils.send(target, "&a" + player.getName() + " &8» &aMe&7: " + str.toString());
				}	
			}
		return false;
	}
}