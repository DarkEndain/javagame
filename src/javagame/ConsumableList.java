package javagame;

import java.util.ArrayList;

public class ConsumableList{

	public ConsumableList() {
		
	}
	public ArrayList<Consumable> consumableList = new ArrayList<Consumable>();
	
	Consumable Healpotion = new Consumable(0, "Healpotion", "Gibt dir Krass Hp", false, true,100, 200);
	
	public void fillList()
	{
		consumableList.add(Healpotion);
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
