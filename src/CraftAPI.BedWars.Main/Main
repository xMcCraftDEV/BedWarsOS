package CraftAPI.BedWars.Main;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

import CraftAPI.BedWars.utils.GameManager;

/**
* @author xMcCraftDEV
*/

public class Main extends JavaPlugin {
	
	private static String pf = "§bBedWars §7» ";
	
	public static ArrayList<String> rot = new ArrayList<>();
	public static ArrayList<String> blau = new ArrayList<>();
	public static ArrayList<String> gelb = new ArrayList<>();
	public static ArrayList<String> grün = new ArrayList<>();
	
	public static boolean canRespawnRot = true;
	public static boolean canRespawnBlau = true;
	public static boolean canRespawnGelb = true;
	public static boolean canRespawnGrün = true;
	
	public static Main plugin;
	
	@Override
	public void onEnable() {
		System.out.println(pf+"§9Das Plugin wurde erfolgreich §4aktiviert");
		GameManager.setState(GameManager.LOBBY);
		plugin = this;
	}
	
	@Override
	public void onDisable() {
		System.out.println(pf+"§aDas plugin wurde erfolgreich §4deaktiviert");
	}
	

}
