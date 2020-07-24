package javagame;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		ConsumableList cList = new ConsumableList();
		cList.fillList();
		EquipmentList eList = new EquipmentList();
		eList.fillList();
		Inventory inventory = new Inventory();
		Player player = new Player();
		AttackList attacklist = new AttackList();
		attacklist.fillList();
		EnemyList enemy = new EnemyList();
		enemy.fillList(attacklist);
		ConsumableList consumable = new ConsumableList();
		consumable.fillList();
		
		inventory.addItem(consumable.getConsumable(0));

		
		inventory.addItem(cList.getConsumable(0));
		inventory.addItem(eList.getEquipment(0));
		inventory.addItem(eList.getEquipment(1));
		
		Item item = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie moechten sie heiﬂen?");
		player.setName(sc.nextLine());
		System.out.println(enemy.summonEnemy(0).getName() + "erscheint vor dir");
		Combat combat = new Combat(player, enemy.summonEnemy(0), attacklist, inventory);
		
		while (combat.isFighting()){	
			

		System.out.println(player.getName() + " HP: " + player.getHp());
		System.out.println("Was moechtest du tun?");
		System.out.println("1. Angreifen");
		System.out.println("2. Skills");
		System.out.println("3. Inventar");
		if(sc.next().charAt(0) == '1')
		{
			
			combat.turns(1, 0);
		}

		}
		
		 
		
	}
}
