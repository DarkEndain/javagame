package javagame;
import java.util.ArrayList;

public class AttackList {

	//AttackList
	ArrayList<Attack> charackterAttackList = new ArrayList<>();
	ArrayList<Attack> enemyList = new ArrayList<>();
	//Konstruktor
	public AttackList() {}
	
	//Liste der Attacken

	Attack bite = new Attack("Bite", "A vicious bite! Let's hope you don't get rabies!", 0, 50, 0, false, false);
	
	
	
	//Ende der Liste von Attacken
	//Funktionen
	public void fillList()
	{	
		enemyList.add(bite);
	}
	
	public ArrayList<Attack> getEnemyAttackList()
	{
		return enemyList;
	}
	
	public Attack learnAttack(int id)
	{
		return charackterAttackList.get(id);
	}
}
