package me.Joserex65.Tutorial;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin{
	
	@Override
	public void onEnable(){
		this.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "Plugin Tutorial activado correctamente. Versi�n actual: 1.0");
		
	}
	
	@Override
	public void onDisable(){
		this.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "Plugin Tutorial desactivado correctamente. Versi�n actual: 1.0");
	}
	

}
