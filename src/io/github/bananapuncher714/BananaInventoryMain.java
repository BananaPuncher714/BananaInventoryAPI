package io.github.bananapuncher714;

import org.bukkit.plugin.java.JavaPlugin;

public class BananaInventoryMain extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info( "Banana Inventories has been enabled!" );
	}
	
	@Override
	public void onDisable() {
		getLogger().info( "Banana Inventories has been disabled!" );
	}
}
