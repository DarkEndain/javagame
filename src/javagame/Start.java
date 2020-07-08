package javagame;

public class Start {

	public static void main(String[] args) {
		System.out.println("Hello Alex");
		Items Itemlist = new Items();
		Itemlist.fillItem();
		Item heal = new Item(0,"a","a",true,true);
		heal = Itemlist.getItem(0);
		System.out.println(heal.getName());
		
	}
}
