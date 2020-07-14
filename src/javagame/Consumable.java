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
	private int restoredHealth;

}
