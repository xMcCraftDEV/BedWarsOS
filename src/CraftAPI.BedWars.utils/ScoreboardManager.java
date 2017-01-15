package CraftAPI.BedWars.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import CraftAPI.BedWars.Main.Main;

/**
* @author xMcCraft
*/

public class ScoreboardManager {
	
	public static void setScoreBoard(Player p) {
		org.bukkit.scoreboard.ScoreboardManager sm = Bukkit.getScoreboardManager();
		Scoreboard s = sm.getNewScoreboard();
		
		Objective o = s.registerNewObjective("Teams", "dummy");
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		o.setDisplayName("§f»§3Respawn§f«");
		
		p.setScoreboard(s);		
	}
	
	public static void UpdateScoreboard(Player p) {
		Scoreboard s = p.getScoreboard();
		Objective o = s.getObjective("Teams");
		if(GameManager.isState(GameManager.GAME)) {
			
			if(Main.canRespawnBlau == true) {
				o.getScore("§2√ §7| §9Blau").setScore(Main.blau.size());				
			} else {
				if(Main.blau.size() != 0) {
					o.getScore("§4X §7| §9Blau").setScore(Main.blau.size());
				} else {
					
				}
			}
			
			
			if(Main.canRespawnRot == true) {
				o.getScore("§2√ §7| §cRot").setScore(Main.rot.size());				
			} else {
				if(Main.rot.size() != 0) {
					o.getScore("§4X §7| §cRot").setScore(Main.rot.size());
				} else {
					
				}
			}
			
			
			if(Main.canRespawnGelb == true) {
				o.getScore("§2√ §7| §eGelb").setScore(Main.gelb.size());				
			} else {
				if(Main.gelb.size() != 0) {
					o.getScore("§4X §7| §eGelb").setScore(Main.gelb.size());
				} else {
					
				}
			}
			
			
			if(Main.canRespawnGrün == true) {
				o.getScore("§2√ §7| §2Grün").setScore(Main.grün.size());				
			} else {
				if(Main.grün.size() != 0) {
					o.getScore("§4X §7| §2Grün").setScore(Main.grün.size());
				} else {
				}
			}			
			
			p.setScoreboard(s);
		} else if(GameManager.isState(GameManager.LOBBY)) {
			
			
			
		}
	}

}
