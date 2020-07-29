package javagame;

import java.util.Random;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		ConsumableList cList = new ConsumableList();
		cList.fillList();
		EquipmentList eList = new EquipmentList();
		eList.fillList();
		Inventory inventory = new Inventory();
		Player player = new Player();
		player.equipItem(eList.getEquipment(0));
		player.equipItem(eList.getEquipment(3));
		player.equipItem(eList.getEquipment(5));
		player.equipItem(eList.getEquipment(8));
		player.equipItem(eList.getEquipment(11));
		inventory.addItem(eList.getEquipment(0));
		inventory.addItem(eList.getEquipment(3));
		inventory.addItem(eList.getEquipment(5));
		inventory.addItem(eList.getEquipment(8));
		inventory.addItem(eList.getEquipment(11));
		AttackList attacklist = new AttackList();
		attacklist.fillList();
		EnemyList enemy = new EnemyList(attacklist);
		enemy.fillList();
		ConsumableList consumable = new ConsumableList();
		consumable.fillList();
		Shop shop = new Shop();
		shop.fillStock(cList, eList);
		inventory.addItem(consumable.getConsumable(0));

		
		//inventory.addItem(cList.getConsumable(0));

		
		Item item = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie moechten sie heißen?");
		player.setName(sc.nextLine());

		
		boolean running=true;
		int action;
		//START ROUTINE
		while(running)
		{
			System.out.println("Hallo "+player.getName()+", wohin soll es gehen?");
			System.out.println("1 Kampf");
			System.out.println("2 Inventar");
			System.out.println("3 Shop");
			action=sc.nextInt();
			switch(action)
			{
			case 1:
				Random ran = new Random();
				Combat combat = new Combat(player, enemy.summonEnemy(ran.nextInt(2)), attacklist, inventory);
				while (combat.isFighting()){	
					

				System.out.println(player.getName() + " HP: " + player.getHp());
				//Gegner Lebensanzeige nicht  vergessen
				System.out.println("Was moechtest du tun?");
				System.out.println("1. Angreifen");
				System.out.println("2. Skills");
				System.out.println("3. Inventar");
				if(sc.next().charAt(0) == '1')
				{
					
					
					combat.turns(1, 0);
					
				}
				/*else if(sc.next().charAt(0) == '2')
				{
					System.out.println("Welchen Skill möchten sie benutzen?");
					for (int i = 0; i < attacklist.getPlayerAttackList().size(); i++) {
						System.out.println(i + ": " + attacklist.getPlayerAttackList().get(i).getName());
					}	
				}*/
				
				}
				break;
			case 2:
				inventory.showInventory();
				break;
			case 3: shop.enterShop(player);
				break;
			default:
				break;
			}
		}
		//COMBAT ROUTINE

		
		 
		
	}
}
