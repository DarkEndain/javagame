package javagame;
import java.util.ArrayList;

public class EnemyList {

	//EnemyList
	ArrayList<Enemy> enemyList = new ArrayList<>();
	AttackList aList = new AttackList();
	
	//Konstruktor
	public EnemyList(AttackList aList) {
		
		this.aList = aList;
	}
	
	
	
	
	//Funktionen
	public void fillList()
	{
		aList.fillList();
		ArrayList<Attack> attackList = new ArrayList<>();
		for (int i = 0; i < 25; i++) {
			attackList.add(aList.getEnemyAttackList().get(0));	
		}
		ArrayList<Consumable> cLoot = new ArrayList<>();
		cLoot=getConsumableList();
		ArrayList<Equipment> eLoot = new ArrayList<>();
		eLoot=getEquipmentList();
		ArrayList<Item> qLoot = new ArrayList<>();
		qLoot=getItemList();
		Enemy wolf = new Enemy("Wolf", "A common forest wolf", 0, 500, 20, 5, 2, 10, 0, 0, 0, 10, 5, 50, 2,
							   null, qLoot, cLoot, eLoot);
		enemyList.add(wolf);
	}
	
	public Enemy summonEnemy(int id)
	{
		return enemyList.get(id);
	}
}
