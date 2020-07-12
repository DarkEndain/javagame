package javagame;
import java.util.ArrayList;

public class EnemyList {

	//EnemyList
	ArrayList<Enemy> enemyList = new ArrayList<>();
	
	//Konstruktor
	public EnemyList() {}
	

	
	//Funktionen
	public void fillList()
	{
		ArrayList<Attack> attackList = new ArrayList<>();
		attackList=getAttackList();
		ArrayList<Consumable> cLoot = new ArrayList<>();
		cLoot=getConsumableList();
		ArrayList<Equipment> eLoot = new ArrayList<>();
		eLoot=getEquipmentList();
		ArrayList<Items> qLoot = new ArrayList<>();
		qLoot=getItemList();
		Enemy wolf = new Enemy("Wolf", "A common forest wolf", 0, 500, 20, 5, 2, 10, 0, 0, 0, 10, 5, 50, 2,
							   attackList, qLoot, cLoot, eLoot);
		enemyList.add(wolf);
	}
	
	public Enemy summonEnemy(int id)
	{
		return enemyList.get(id);
	}
}
