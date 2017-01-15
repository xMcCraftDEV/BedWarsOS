package CraftAPI.BedWars.utils;

import org.bukkit.entity.Player;

import CraftAPI.BedWars.Main.Main;

/**
* @authos xMcCraftDEV
*/

public class Methods {

	public static String getTeam(Player p) {
		
		String s;
		
		if(Main.blau.contains(p)) {
			s = "§7→ §9Blau";
		} else if(Main.rot.contains(p)) {
			s = "§7→ §cRot";
		} else if(Main.grün.contains(p)) {
			s = "§7→ §2Grün";
		} else if(Main.gelb.contains(p)) {
			s = "§7→ §eGelb";
		} else {
			
			s = "§7→ §cKein Team";	
		
		}	
		return s;		
		
	}
	public static String getExactTeam(Player p) {
		
		String s;
		
		if(Main.blau.contains(p)) {
			s = "Blau";
		} else if(Main.rot.contains(p)) {
			s = "Rot";
		} else if(Main.grün.contains(p)) {
			s = "Grün";
		} else if(Main.gelb.contains(p)) {
			s = "Gelb";
		} else {
			
			s = "§7→ §cKein Team";	
		
		}	
		return s;
	}
}
