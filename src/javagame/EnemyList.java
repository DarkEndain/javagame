package javagame;
import java.util.ArrayList;

public class EnemyList {

	//EnemyList
	ArrayList<Enemy> enemyList = new ArrayList<>();
	AttackList aList = new AttackList();
	Enemy wolf = new Enemy("Wolf", "A common forest wolf", 0, 500, 20, 5, 2, 10, 0, 0, 0, 10, 5, 50, 2,
			   null);
Enemy baer = new Enemy("Baer", "Ein gemeiner Grizzlybaer.", 1, 1000, 10, 10, 3, 7, 6, 10, 0, 0, 3, 30, 50,
null);
Enemy troll = new Enemy("Berg-Troll", "Ein hsslicher Troll, der unter einer Brcke im Wald lebt.", 2, 2000, 0, 20, 0, 5, 10, 20, 20, 0, 1, 50, 200,
null);
	
	//Konstruktor
	public EnemyList(AttackList aList) {
		
		this.aList = aList;
	}
	

	
	
	
	//Funktionen
	public void fillList()
	{
		aList.fillList();
		ArrayList<Attack> attackList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			attackList.add(aList.getEnemyAttackList().get(i));	
		}
		//qLoot=getItemList();

		enemyList.add(wolf);
		enemyList.add(baer);

		enemyList.get(0).setAttacks(attackList);
		enemyList.get(1).setAttacks(attackList);
		attackList.clear();
		for(int i = 3; i< 6; i++)
		{
			attackList.add(aList.getEnemyAttackList().get(i));
		}
		enemyList.add(troll);
		enemyList.get(2).setAttacks(attackList);
	}
	
	public Enemy summonEnemy(int id)
	{
		return enemyList.get(id);
	}
}
