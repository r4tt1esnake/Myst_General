package me.vazguild.myst_general.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vazguild.myst_general.Utils;

public class TIMEDAY implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		Player player = (Player) sender;
		World world = player.getWorld();
			world.setTime(0);
			Utils.send(player, "&7Time set to &aDay&7!");
			return true;
	}
}
