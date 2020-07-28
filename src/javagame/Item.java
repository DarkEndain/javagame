package javagame;

public class Item {

	public Item(int id, String name, String description, boolean inInventory, boolean usable,int cost) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.inInventory = inInventory;
		this.usable = usable;
		this.cost = cost;
	}
	public Item() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String description;
	private boolean inInventory;
	private boolean usable;
	private int cost;
	public String getName()
	{
		return this.name;
	}
	public int getCost()
	{
		return this.cost;
	}
	public void setInInventory(boolean inInventory) {
		this.inInventory = inInventory;
	}


}


