package javagame;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

	
	private Equipment equipment;
	private ArrayList<Equipment> inventorylist = new ArrayList<Equipment>();
	//Create a list for the Items form the Player
	private ArrayList<Consumable>  consumables = new ArrayList<Consumable>();
	//Todo SlotId in Kommentar festlegen
	private ArrayList<Equipment> armor = new ArrayList<Equipment>();
	private ArrayList<Item> questitem = new ArrayList<Item>();

	
	public Inventory(Equipment equipment,EquipmentList equipmentlist)
	{
		this.equipment=equipment;
		this.inventorylist=equipmentlist.getEquipmentList();
	}
	
	
	
	Scanner showInventory = new Scanner(System.in);
	

	
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
	
	public ArrayList<Consumable> getConsumableInventory()
	{
		return consumables;
	}
	public ArrayList<Equipment> getArmoryInventory()
	{
		return armor;
	}
	public ArrayList<Item> getQuestItem()
	{
		return questitem;
	}
	
	public void showInventory(int action)
	{
		char sh = showInventory.next().charAt(0);
		
		switch (action)
		{
		case 3:
					System.out.println("Dein Inventar");
		for(int i = 0;i<this.armor.size();i++)
			{
			
			
				
			System.out.println("Ausrüstung: "+inventorylist.get(i).getName());
		
		}
		
			break;
			
		case 4:
			
			System.out.println("Deine Verbrauchsgegenstände");
			
			for(int i =0;i<this.consumables.size();i++)
			{
				System.out.println("Heiltrank: ");
			}
			
			break;
			
			}
			
			
			
		
		
	}
}
