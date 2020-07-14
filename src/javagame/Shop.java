package javagame;

import java.util.ArrayList;

public class Shop {

	//Create a list for the Stock from the Shop
	public ArrayList<Item>  stock = new ArrayList<Item>();
	
	//Add a Item to the Stock
	private void addItem(Item item)
	{
		stock.add(item);
	}
	
	//Delete a Item from the Stock
	private void deleteItem(Item item)
	{
		stock.remove(item);
	}
	
	//Buy a Item from the shop
	private int buyItem(Item item, int playergold)
	{
		if (playergold > item.getCost())
		{
			playergold =- item.getCost();
			addItem(item);
			return playergold;
		}
		else
		{
			return playergold;
		}
	}
}
