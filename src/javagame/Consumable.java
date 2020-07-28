package javagame;

public class Consumable extends Item{
	
	
	
	public Consumable(int id, String name, String description, boolean inInventory, boolean usable, int cost, 
			boolean curePoison,int restoredHealth) {

		this.id = id;
		this.name = name;
		this.description = description;
		
		this.inInventory = inInventory;
		this.usable = usable;
		this.curePoison = curePoison;
		this.restoredHealth = restoredHealth;
	}
	public Consumable()
	{
		
	}
	private int id;
	private String name;
	private String description;
	private boolean inInventory;
	private boolean usable;
	private boolean curePoison;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public boolean isInInventory() {
		return inInventory;
	}
	public boolean isUsable() {
		return usable;
	}
	public int getRestoredHealth() {
		return restoredHealth;
	}
	public boolean isCurePoison() {
		return curePoison;
	}
	private int restoredHealth;

}
