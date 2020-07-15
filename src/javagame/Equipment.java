package javagame;

public class Equipment extends Item {

	private int id;
	private int slotId;
	private String name;
	private String description;
	private boolean InInventory;
	private boolean equipped;
	private boolean isTwoHanded;
	private int cost;
	private int hp;
	private int mp;
	
	private int baseStrength;
	private int baseIntelect;
	private int baseAgility;
	private int baseLuck;
	
	private int armor;
	private int resistance;
	private int dodge;
	private int initiative;
	public Equipment(int id, int slotId, String name, String description, boolean inInventory, boolean usable, int cost, 
			boolean equipped, boolean isTwoHanded, int hp, int mp, int baseStrength, int baseIntelect, int baseAgility,
			int baseLuck, int armor, int resistance, int dodge, int initiative) {
		super(id, name, description, inInventory, usable, cost);
		this.slotId = slotId;
		this.equipped = equipped;
		this.isTwoHanded = isTwoHanded;
		this.hp = hp;
		this.mp = mp;
		this.baseStrength = baseStrength;
		this.baseIntelect = baseIntelect;
		this.baseAgility = baseAgility;
		this.baseLuck = baseLuck;
		this.armor = armor;
		this.resistance = resistance;
		this.dodge = dodge;
		this.initiative = initiative;
	}
	
	
	

	


	

}
