package javagame;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	Scanner sc= new Scanner(System.in);
	//Create a list for the Stock from the Shop

	public ArrayList<Item> stock = new ArrayList<Item>();

	public Shop() {}
	//Add a Item to the Stock
	public void fillStock(ConsumableList cList, EquipmentList eList)
	{
		int i=0;
		stock.add(cList.getConsumableList().get(0));
		stock.add(cList.getConsumableList().get(1));
		for (Equipment equipment : eList.getEquipmentList()) {
			stock.add(equipment);
			i++;
		}
		
	}
	
	//Delete a Item from the Stock
	private void deleteItem(Item item)
	{
		stock.remove(item);
	}
	
	//Buy a Item from the shop
	private void buyItem(Item item, Player player)
	{
		if (player.getGold() >= item.getCost())
		{
			player.setGold(player.getGold()-item.getCost()); 
			player.addItemToPlayerInventory(item);
		}
		else
		{
			System.out.println("Nicht genug Gold vorhanden!");
		}
	}
	
	public void enterShop(Player player)
	{
		int action, i=1;
		boolean inShop=true;
		
		while(inShop)
		{
		System.out.println("Willkommen in meinem Laden, "+player.getName()+"!");
		System.out.println(player.getGold()+" Gold verfügbar");
		System.out.println();
		for (Item item : stock) {
			System.out.println((i)+" "+item.getName()+" "+item.getCost()+" Gold");
			i++;
			}
		action=sc.nextInt();
		
		System.out.println(i+" Zurueck zur Stadt");
		if (action==i)
		{
			inShop=false;
		}
		else
		{
			//Check einfügen ob das Item bereits im Inventar ist!!!
			buyItem(stock.get(action-1), player);
		}
		i=1;
		}
		
	}	
		
		
}
