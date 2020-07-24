package javagame;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;


public class Combat {

	
	private boolean fighting = true;
	private Player player;
	private Enemy npc;
	private ArrayList<Attack> playerlist;
	private ArrayList<Attack> enemylist;
	private ArrayList<Consumable> playerconsumablelist;
	boolean playerfirst = true;
	
	
	
	public Combat(Player player, Enemy npc, AttackList attacklist, Inventory playerconsumablelist)
	{
		this.player = player;
		this.npc = npc;
		this.playerlist = attacklist.getPlayerAttackList();
		this.enemylist = npc.getAttacks();
		this.playerconsumablelist = playerconsumablelist.getConsumableInventory();
		
	}
	
	
	
	public boolean firsturns()
	{
		if(player.getInitiative() > npc.getInitiative())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void turns(int action, int action2)
	{
		if (player.isPoison())
		{
			player.setHp(player.getHp() - 10);
			System.out.println(player.getName() + " ist vergiftet und erleidte 10 Schaden");
		}
		else
		{
			
		}
		if(player.getHp() >= 1 && npc.getHp() >= 1)
		{
			if(player.getInitiative() > npc.getInitiative())
			{
				playerturn(action,  action2);
				enemyturn();
			}
			else
			{
				enemyturn();
				playerturn(action, action2);
				
			}

		}
		else
		{
			fighting = false;
		}
	}
	public void playerturn(int action, int action2)
	{

		if(!player.isStun())
		{
		switch (action) {
		case 1:
			npc.setHp(npc.getHp() - player.getDmg() );
			System.out.println("Spieler hat dem Gegner " + player.getDmg() + " Schaden hinzugefügt");
			break;
		case 2:
			npc.setHp(npc.getHp() - playerlist.get(action2).getDamage() + player.getDmg());
			System.out.println("Spieler benutzt" + playerlist.get(action2).getName() 
					+ " und fügt dem Gegner" + playerlist.get(action2).getDamage() 
					+ player.getDmg() + " Schaden hinzu");
			break;
		case 3:
			if(playerconsumablelist.get(action2).isCurePoison())
			{
				player.setPoison(false);
				System.out.println(player.getName() + " hat sich von Gift erholt");
			}
			player.setHp(player.getHp() + playerconsumablelist.get(action2).getRestoredHealth());
			System.out.println(player.getName() + " hat " + playerconsumablelist.get(action2).getRestoredHealth() + " Leben geheilt" );
		default:
			break;
		}
		}
		else
		{
			player.setStun(false);
		}
		
	}
	public void enemyturn()
	{ 
		Random ranaction = new Random();
		int action = ranaction.nextInt(2);
			player.setHp(player.getHp() - (enemylist.get(action).getDamage() - player.getArmor()));
			System.out.println(npc.getName() 
					+ " " +enemylist.get(action).getDescription() + " und fügt " 
			+ (enemylist.get(action).getDamage() - player.getArmor()) + " Schaden zu");
		}



	public boolean isFighting() {
		return fighting;
	}
	}
	
	
	

