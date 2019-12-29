package me.Rexy.CustomHelp;

import org.bukkit.plugin.java.JavaPlugin;

import me.Rexy.CustomHelp.Commands.Help;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		saveDefaultConfig();
		new Help(this);
	}

}
