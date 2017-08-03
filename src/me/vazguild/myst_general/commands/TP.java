package me.vazguild.myst_general.commands;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vazguild.myst_general.Utils;

public class TP implements CommandExecutor {
    
    @SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                if (player.hasPermission("myth.general.tp")) {
                    if (args.length == 0) {
                            Utils.send(player, "&7Usage: &Tp &7<&aPlayer&7>");
                        } else if (args.length == 1) {
                                if (Bukkit.getOfflinePlayer(args[0]) != null) {
                                    OfflinePlayer offlineTarget = Bukkit.getOfflinePlayer(args[0]);
                                    if (offlineTarget.isOnline()) {
                                        Player target = (Player)offlineTarget;

                                        player.teleport(target.getLocation());
                                        if(player == target) {
                                        	Utils.send(player, "&7You cannot tp to yourself!");
                                        	return true;
                                        }
                                    } else {
                                        Utils.send(player, "&7That player is not online!");
                                    }
                                }
                            } else {
                                Utils.send(player, "&7That player does not exist!");
                            }
                    } else {
                        Utils.send(player, "&7We're sorry, but you don't have &cPermission&7!");
                }
            }
    return false;
    }
}
