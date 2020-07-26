package javagame;

import java.util.ArrayList;

public class ConsumableList{

	public ConsumableList() {
		
	}
	public ArrayList<Consumable> consumableList = new ArrayList<Consumable>();
	
	private Consumable Healpotion = new Consumable(0, "Healpotion", "Gibt dir Krass Hp", false, true,100, 200);
	private Consumable Antivenom = new Consumable(1, "Gegengift", "Heilt Vergiftung", false, true, 0, 100);
	public void fillList()
	{
		consumableList.add(Healpotion);
		consumableList.add(Antivenom);
	}
	public Consumable getConsumable(int id)
	{
		return consumableList.get(id);
	}
	public ArrayList<Consumable> getConsumableList()
	{
		return consumableList;
	}
			
}
