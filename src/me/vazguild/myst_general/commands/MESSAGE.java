package me.vazguild.myst_general.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vazguild.myst_general.Main;
import me.vazguild.myst_general.Utils;

public class MESSAGE implements CommandExecutor {
	
	Main main = Main.getPlugin(Main.class);
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(sender instanceof Player) {
				if(args.length == 0) {
					Utils.send(player, "&7Usage: &7/&amsg [&aPlayer &aMessage]&7.");
					return false;
				}
				if(args.length == 1) {
					Utils.send(player, "&7Please specify a &aMessage&7!");
				} else {
					Player target = Bukkit.getPlayer(args[0]);
					if(target == null) {
						Utils.send(player, "&7Player not &aFound&7!");
						return false;
					}
					StringBuilder str = new StringBuilder();
					for (int i = 1; i < args.length; i++) {
						str.append(args[i] + " ");
					}
					// Sends the players the messages
					Utils.send(player, "&aMe &8» &a" + target.getName() + " &8» &7" + str.toString());
					Utils.send(target, "&a" + player.getName() + " &8» &aMe&7: " + str.toString());
					main.lastmsg.put(player, target);
					main.lastmsg.put(target, player);
				}
			}
		return false;
	}
}