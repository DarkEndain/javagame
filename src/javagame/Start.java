package javagame;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		System.out.println("Hello Alex");
		
		System.out.println("Hall ich bins Thomas");
		
		ConsumableList cList = new ConsumableList();
		cList.fillList();
		EquipmentList eList = new EquipmentList();
		eList.fillList();
		Inventory inventory = new Inventory();
		
		inventory.addItem(cList.getConsumable(0));
		inventory.addItem(eList.getEquipment(0));
		inventory.addItem(eList.getEquipment(1));
		
		Item item = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hallo moechtest du dein Inventar sehen Y/N");
		char input = sc.next().charAt(0);
		if (input == 'Y' || input == 'y')
		{
			//Gibt eine Liste der Armory aus der Klasse Inventar zurück und für jedes Item in dieser Liste gibt er das Item aus
			
			for (Item e: inventory.returnArmoryInventory()) {
				System.out.println(e.getName());
			}
		}
		
		
		
	}
}
