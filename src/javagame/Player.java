package javagame;

public class Player {

	private String name;
	public void setName(String name) {
		this.name = name;
	}
	private int hp;
	private int mp;
	private int baseStrength;
	private int bonusStrenght;
	private int baseIntelect;
	private int bonusIntelect;
	private int baseAgility;
	private int bonusAgility;
	private int baseLuck;
	private int bonusLuck;
	private int armor;
	private int resistence;
	private int dodge;
	private int initiative;
	private Inventory inventory;
	private int gold;
	private int dmg;
	private boolean stun;
	private boolean poison;


	/*
	 * Todo
	 * Verkn�pfung zum UNventar und zur Armory m�ssen noch hinzugef�gt werden
	 */
	public Player()
	{
		this.dmg = 20;
		this.hp = 200;
	}
	
	

	
	
	public boolean isStun() {
		return stun;
	}

	public void setStun(boolean stun) {
		this.stun = stun;
	}

	public boolean isPoison() {
		return poison;
	}

	public void setPoison(boolean poison) {
		this.poison = poison;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getBaseStrength() {
		return baseStrength;
	}

	public int getBonusStrenght() {
		return bonusStrenght;
	}

	public int getBaseIntelect() {
		return baseIntelect;
	}

	public int getBonusIntelect() {
		return bonusIntelect;
	}

	public int getBaseAgility() {
		return baseAgility;
	}

	public int getBonusAgility() {
		return bonusAgility;
	}

	public int getBaseLuck() {
		return baseLuck;
	}

	public int getBonusLuck() {
		return bonusLuck;
	}

	public int getArmor() {
		return armor;
	}

	public int getResistence() {
		return resistence;
	}

	public int getDodge() {
		return dodge;
	}

	public int getInitiative() {
		return initiative;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public int getGold() {
		return gold;
	}
	public boolean equipItem(Equipment equipment)
	{
		if(!equipment.isEquipped())
		switch(equipment.getSlotId())
		{
		case 0:
			
		}
		else
		{
			return false;
		}
		
		return false;
	}



	
}