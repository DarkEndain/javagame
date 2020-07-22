package javagame;

public class Consumable extends Item{
	
	public Consumable(int id, String name, String description, boolean inInventory, boolean usable, int restoredHealth, int cost) {
		super(id, name, description, inInventory, usable, restoredHealth);
		// TODO Auto-generated constructor stub
	}
	public Consumable()
	{
		
	}
	private int id;
	private String name;
	private String description;
	private int amount;
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
	public int getAmount() {
		return amount;
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
