package javagame;
import java.util.ArrayList;

public class AttackList {

	//AttackList
	ArrayList<Attack> allAttacks = new ArrayList<>();
	ArrayList<Attack> playerAttackList = new ArrayList<>();
	ArrayList<Attack> enemyList = new ArrayList<>();
	//Konstruktor
	public AttackList() {}
	
	//Liste der Attacken

	Attack bite = new Attack("Bite", "A vicious bite! Let's hope you don't get rabies!", 0, 50, 0, false, false);
	Attack hit = new Attack("hit", "voll auf die ömme", 1, 25, 0, false, false);
	Attack scratch = new Attack("scratch","Aua meine Katze ist boese",2,40,0,false,false);
	
	
	//Ende der Liste von Attacken
	//Funktionen
	public void fillList()
	{	
		enemyList.add(bite);
		enemyList.add(hit);
		enemyList.add(scratch);
	}
	
	public ArrayList<Attack> getEnemyAttackList()
	{
		return enemyList;
	}
	public ArrayList<Attack> getPlayerAttackList()
	{
		return playerAttackList;
	}
	public void learnAttack(int id)
	{
		playerAttackList.add(allAttacks.get(id));
	}
	public Attack useAttack(int id)
	{
		return playerAttackList.get(id);
	}
}
