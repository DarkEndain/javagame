package javagame;
import java.util.ArrayList;

public class AttackList {

	//AttackList
	ArrayList<Attack> attackList = new ArrayList<>();
	
	//Konstruktor
	public AttackList() {}
	
	//Funktionen
	public void fillList()
	{
		Attack bite = new Attack("Bite", "A vicious bite! Let's hope you don't get rabies!", 0, 50, 0, false, false);
		attackList.add(bite);
	}
	
	public ArrayList<Attack> getAttackList()
	{
		return attackList;
	}
	
	public Attack learnAttack(int id)
	{
		return attackList.get(id);
	}
}
