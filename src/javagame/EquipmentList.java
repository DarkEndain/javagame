package javagame;

import java.util.ArrayList;

public class EquipmentList {

	
	
	public ArrayList<Equipment> equipmentList = new ArrayList<Equipment>();
	
	
	private Equipment sword1h = new Equipment(0, 0, 
			"Schwert", "cool", false, true, 100, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	
	public void fillList()
	{
		equipmentList.add(sword1h);
	}
	public Equipment getEquipment(int id)
	{
		return equipmentList.get(id);
	}
	public ArrayList<Equipment> getEquipmentList()
	{
		return equipmentList;
	}
}
