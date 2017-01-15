package CraftAPI.BedWars.Teams;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import CraftAPI.BedWars.APIs.ItemCreator;

public class TeamInventory implements Listener {
	
	public static void openInventory(Player p) {
		
		Inventory inv = Bukkit.createInventory(null, 27, "§3Wähle dein §fTeam:");
		
		inv.setItem(1, ItemCreator.CreateItemwithMaterial(Material.WOOL, 0, 1,"", null));
		inv.setItem(3, ItemCreator.CreateItemwithMaterial(Material.WOOL, 0, 1,"", null));
		inv.setItem(5, ItemCreator.CreateItemwithMaterial(Material.WOOL, 0, 1,"", null));
		inv.setItem(7, ItemCreator.CreateItemwithMaterial(Material.WOOL, 0, 1,"", null));
		
		p.openInventory(inv);
		
	}
	
	
	
	
}
