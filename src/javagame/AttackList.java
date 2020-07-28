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

	Attack bite = new Attack("Biss", "Hoffentlich hat das Vieh nicht Tollwut!", 0, 50, 0, false, false);
	Attack hit = new Attack("Hieb", "voll auf die ömme", 1, 25, 0, false, false);
	Attack scratch = new Attack("Kratzer","Aua meine Katze ist boese",2,40,0,false,false);
	Attack club = new Attack("Keulenhieb","Diese Keule ist so groß!",3,100,0,false,false);
	Attack babble = new Attack("Labern","DAS MÜSSTET IHR EIGENTLICH KÖNNEN!",4,0,0,true,false);
	Attack guilty = new Attack("Schlechtes Gewissen","Ihr seid so nutzlos",5,0,0,false,true);
	
	
	//Ende der Liste von Attacken
	//Funktionen
	public void fillList()
	{	
		enemyList.add(bite);
		enemyList.add(hit);
		enemyList.add(scratch);
		enemyList.add(club);
		enemyList.add(babble);
		enemyList.add(guilty);
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
