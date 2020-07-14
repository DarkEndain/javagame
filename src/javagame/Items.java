package javagame;

import java.util.ArrayList;
import java.util.Collection;

public class Items extends Item{

	
	


public Items() {
	// TODO Auto-generated constructor stub
}
	
	public ArrayList<Item> Itema = new ArrayList<Item>();

	Item Healpotion = new Item(0, "Healpotion", "Gibt dir Krass Hp", false, true,20);
	
	public void fillItem()
	{
	Itema.add(Healpotion);
	}
	public Item getItem(int id)
	{
		return Itema.get(id);
	}
	public ArrayList<Item> getItemList()
	{
		return Itema;
	}
	
}
