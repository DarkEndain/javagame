package javagame;
import java.util.ArrayList;

public class EnemyList {

	//EnemyList
	ArrayList<Enemy> enemyList = new ArrayList<>();
	
	//Konstruktor
	public EnemyList() {
		
	
	}
	
	
	
	
	//Funktionen
	public void fillList(AttackList aList)
	{
		aList.fillList();
		ArrayList<Attack> attackList = new ArrayList<>();

		ArrayList<Consumable> cLoot = new ArrayList<>();
		//cLoot=getConsumableList(0);
		ArrayList<Equipment> eLoot = new ArrayList<>();
		//eLoot=getEquipmentList(0);
		ArrayList<Item> qLoot = new ArrayList<>();
		//qLoot=getItemList(0);
		
		for (int i = 0; i < 3; i++) {
			attackList.add(aList.getEnemyAttackList().get(i));	
		}
		Enemy wolf = new Enemy("Wolf", "A common forest wolf", 0, 500, 20, 5, 2, 10, 0, 0, 0, 10, 5, 50, 2,
							   attackList, qLoot, cLoot, eLoot);
		enemyList.add(wolf);
	}
	
	public Enemy summonEnemy(int id)
	{
		return enemyList.get(id);
	}
}
