package me.Rexy.CustomHelp.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import be.maximvdw.placeholderapi.PlaceholderAPI;
import be.maximvdw.placeholderapi.PlaceholderReplacer;
import be.maximvdw.placeholderapi.PlaceholderReplaceEvent;

import me.Rexy.CustomHelp.Main;
import me.Rexy.CustomHelp.Utils.Utils;

public class Help implements CommandExecutor {
	
	private Main plugin;
		
	public Help(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("Help").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Cant Do This In Console");
			return true;
		}
		Player p = (Player) sender;
		
		for (String line : plugin.getConfig().getStringList("Help")) {
			  p.sendMessage(Utils.chat(line));

	   }
		return false;
	}
}

