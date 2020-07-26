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
		for (int i = 0; i < 100; i++) {
			if (i>=0)
			attackList.add(aList.getEnemyAttackList().get(0));
			if (i>=50)
				attackList.add(aList.getEnemyAttackList().get(1));
			if (i>=75)
				attackList.add(aList.getEnemyAttackList().get(2));
		}
		ArrayList<Consumable> cLoot = new ArrayList<>();
		//cLoot=getConsumableList();
		ArrayList<Equipment> eLoot = new ArrayList<>();
		//eLoot=getEquipmentList();
		ArrayList<Item> qLoot = new ArrayList<>();
		//qLoot=getItemList();
		Enemy wolf = new Enemy("Wolf", "Ein gewoehnlicher Waldwolf.", 0, 500, 20, 5, 2, 10, 0, 0, 0, 10, 5, 50, 20,
							   null, cLoot, eLoot);
		Enemy baer = new Enemy("Baer", "Ein gemeiner Grizzlybaer.", 1, 1000, 10, 10, 3, 7, 6, 10, 0, 0, 3, 30, 50,
				   null, cLoot, eLoot);
		Enemy troll = new Enemy("Troll", "Ein hässlicher Troll, der unter einer Brücke im Wald lebt.", 2, 2000, 0, 20, 0, 5, 10, 20, 20, 0, 1, 50, 200,
				   null, cLoot, eLoot);
		enemyList.add(wolf);
		enemyList.add(baer);
		enemyList.add(troll);
	}
	
	public Enemy summonEnemy(int id)
	{
		return enemyList.get(id);
	}
}
