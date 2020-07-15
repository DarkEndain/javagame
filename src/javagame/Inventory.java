package javagame;

import java.util.ArrayList;

public class Inventory {

	//Create a list for the Items form the Player
	private ArrayList<Consumable>  consumables = new ArrayList<Consumable>();
	//Todo SlotId in Kommentar festlegen
	private ArrayList<Equipment> armor = new ArrayList<Equipment>();
	
	//Add a Item to the Inventory
	public void addItem(Item item)
	{
		if(item instanceof Consumable)
		{
			consumables.add((Consumable) item);
		}
		else if(item instanceof Equipment)
		{
			armor.add((Equipment) item);
		}
		
	}
	
	//Delete a Item from the Inventory
	/*private void deleteItem(ItemList item)
	{
		Inventory.remove(item);
	}*/
	
	public ArrayList<Consumable> returnConsumableInventory()
	{
		return consumables;
	}
	public ArrayList<Equipment> returnArmoryInventory()
	{
		return armor;
	}
}
