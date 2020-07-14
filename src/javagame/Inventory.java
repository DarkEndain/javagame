package javagame;

import java.util.ArrayList;

public class Inventory {

	//Create a list for the Items form the Player
	public ArrayList<Items>  Inventory = new ArrayList<Items>();
	
	//Add a Item to the Inventory
	private void addItem(Items item)
	{
		Inventory.add(item);
	}
	
	//Delete a Item from the Inventory
	private void deleteItem(Items item)
	{
		Inventory.remove(item);
	}
}
