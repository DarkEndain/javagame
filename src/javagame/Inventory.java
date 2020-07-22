package javagame;

import java.util.ArrayList;

public class Inventory {

	//Create a list for the Items form the Player
	private ArrayList<Consumable>  consumables = new ArrayList<Consumable>();
	//Todo SlotId in Kommentar festlegen
	private ArrayList<Equipment> armor = new ArrayList<Equipment>();
	private ArrayList<Item> questitem = new ArrayList<Item>();
	
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
		else if(item instanceof Item)
		{
			questitem.add((Item) item);
		}
		
	}
	
	
	private void deleteItem(Item item)
	{
		if(item instanceof Consumable)
		{
			consumables.remove((Consumable) item);
		}
		else if(item instanceof Equipment)
		{
			armor.remove((Equipment) item);
		}
		else if(item instanceof Item)
		{
			questitem.remove((Item) item);
		}
	}
	
	public ArrayList<Consumable> returnConsumableInventory()
	{
		return consumables;
	}
	public ArrayList<Equipment> returnArmoryInventory()
	{
		return armor;
	}
	public ArrayList<Item> returnQuestItem()
	{
		return questitem;
	}
}
