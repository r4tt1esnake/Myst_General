package me.vazguild.myst_general.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vazguild.myst_general.Utils;

public class TIME implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		Player player = (Player) sender;
		World world = player.getWorld();
		if(cmd.getName().equalsIgnoreCase("time")) {
			Utils.send(player, "&7Usage: &aTime &7<&aSet&7> &7<&aTime&7>");
			return false;
		}
		if(args[0].equalsIgnoreCase("set")) {
			Utils.send(player, "&7Usage: &aTime &7<&aSet&7> &7<&aTime&7>");
			return false;
		}
		if(args[0].equalsIgnoreCase("day")) {
			world.setTime(0);
			Utils.send(player, "&7Time set to &aDay&7!");
		}
		if(args[0].equalsIgnoreCase("night")) {
			world.setTime(13000);
			Utils.send(player, "&7Time set to &aNight&7!");
		}
		return false;
	}
}
