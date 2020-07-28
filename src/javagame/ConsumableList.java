package javagame;

import java.util.ArrayList;

public class ConsumableList{

	public ConsumableList() {
		
	}
	public ArrayList<Consumable> consumableList = new ArrayList<Consumable>();
	
	private Consumable Healpotion = new Consumable(0, "Heiltrank der Mittwochsfrosches", "Der Schleim heilt dich um 200 Leben", false, true, 200, false, 200);
	private Consumable Antivenom = new Consumable(1, "Gegengift", "Heilt Vergiftung", false, true, 100,true,0);
	private Consumable PepsiMax = new Consumable(2, "Pepsi Max Vanilla", "Ein erfrischendes Getränk. Heilt 500 Leben", false, true, 1000, true, 500);
	public void fillList()
	{
		consumableList.add(Healpotion);
		consumableList.add(Antivenom);
		consumableList.add(PepsiMax);
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
