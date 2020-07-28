package javagame;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

	
	Scanner showInventory = new Scanner(System.in);
	
	private Equipment equipment;
	private ArrayList<Equipment> inventorylist = new ArrayList<Equipment>();
	//Create a list for the Items form the Player
	private ArrayList<Consumable>  consumables = new ArrayList<Consumable>();
	//Todo SlotId in Kommentar festlegen
	private ArrayList<Equipment> armor = new ArrayList<Equipment>();
	private ArrayList<Item> questitem = new ArrayList<Item>();

	public Inventory()
	{
		
	}
	
	
	
	

	
	//Add a Item to the Inventory
	public void addItem(Item item)
	{
		item.setInInventory(true);
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
	
	public void showInventory()
	{
		System.out.println("Was möchten sie sehen?");
		System.out.println("1. Equipment");
		System.out.println("2. Consumable");
		int sh = showInventory.nextInt();
		
		switch (sh)
		{
		case 1:
					System.out.println("Dein Inventar");
					System.out.println("------------------------------");		
					for(int i = 0;i<this.armor.size();i++)
			{
			String equiped = "";
			if (armor.get(i).isEquipped())
			{
				equiped = "E";
			}
							
			System.out.println( " Ausrüstung: "+armor.get(i).getName() + " (" + equiped +")\t\t"  + armor.get(i).getDescription() );
			
		
		}
		
			break;
			
		case 2:
			
			System.out.println("Deine Verbrauchsgegenstände");
			System.out.println("---------------------------------");
			for(int i =0;i<this.consumables.size();i++)
			{
				System.out.println("Tränke: "+consumables.get(i).getName() + "\t\t " + consumables.get(i).getDescription());
			}
			
			break;
			
			}
	}

}
