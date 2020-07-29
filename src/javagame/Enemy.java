package javagame;

import java.util.ArrayList;

public class Enemy {

	//Enemy Info
	private String name;
	private String description;
	private int id;
	
	//Stats
	private int hp;
	private int maxhp;
	private int mp;
	
	private int baseStrength;
	private int baseIntelect;
	private int baseAgility;
	private int baseLuck;
	
	private int armor;
	private int resistance;
	private int dodge;
	private int initiative;
	
	//Misc
	private int spawnrate;
	private int droppedGold;
	
	//Attacks
	private ArrayList<Attack> attacks = new ArrayList<>();
	
	//Konstruktoren
	public Enemy() {}
	public Enemy(String name, String description, int id, int hp,int mp, int baseStrength, int baseIntelect, int baseAgility, int baseLuck,
				 int armor, int resistance, int dodge, int initiative, int spawnrate, int droppedGold, ArrayList<Attack> attacks) 
	{
		this.name=name;
		this.id=id;
		this.maxhp = hp;
		this.hp=hp;
		this.mp=mp;
		this.baseStrength=baseStrength;
		this.baseIntelect=baseIntelect;
		this.baseAgility=baseAgility;
		this.baseLuck=baseLuck;
		this.armor=armor;
		this.resistance=resistance;
		this.dodge=dodge;
		this.initiative=initiative;
		this.spawnrate=spawnrate;
		this.droppedGold=droppedGold;
		this.attacks=attacks;
		
	}
	
	public int getMaxhp() {
		return maxhp;
	}
	//Getter
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getId() {
		return id;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public void setAttacks(ArrayList<Attack> attacks) {
		this.attacks = attacks;
	}
	public void addAttacks(Attack attack)
	{
		this.attacks.add(attack);
	}
	public int getBaseStrength() {
		return baseStrength;
	}
	public int getBaseIntelect() {
		return baseIntelect;
	}
	public int getBaseAgility() {
		return baseAgility;
	}
	public int getBaseLuck() {
		return baseLuck;
	}
	public int getArmor() {
		return armor;
	}
	public int getResistance() {
		return resistance;
	}
	public int getDodge() {
		return dodge;
	}
	public int getInitiative() {
		return initiative;
	}
	public int getSpawnrate() {
		return spawnrate;
	}
	public int getDroppedGold() {
		return droppedGold;
	}
	public ArrayList<Attack> getAttacks() {
		return attacks;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
}
