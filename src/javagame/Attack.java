package javagame;

public class Attack {

	//Attack Info
	private String name;
	private String description;
	private int id;
	
	private int damage;
	private int heal;
	private boolean stun;
	private boolean poison;
	
	public Attack() {}
	
	public Attack(String name, String description, int id, int damage, int heal, boolean stun, boolean poison)
	{
		this.name=name;
		this.id=id;
		this.description=description;
		this.damage=damage;
		this.heal=heal;
		this.stun=stun;
		this.poison=poison;
	}
	

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public int getDamage() {
		return damage;
	}

	public int getHeal() {
		return heal;
	}

	public boolean isStun() {
		return stun;
	}

	public boolean isPoison() {
		return poison;
	}
	
	
}
