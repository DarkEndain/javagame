package javagame;

import java.util.ArrayList;

public class EquipmentList {

	
	
	public ArrayList<Equipment> equipmentList = new ArrayList<Equipment>();
	
	
	private Equipment sword1h = new Equipment(0, 0, 
			"Schwert", "Ein einfaches Schwert, zuverlässig und robust. Ideal für anfänger und erfahrene Abenteure", 
											false, true, 100, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	
	private Equipment sword2h = new Equipment(1, 1, 
			"Zweihändisches Schwert", "Länger und schwerer als das normale Schwert. Selbst Muskelpackete müssen dieses Schwert mit zwei Händen führen", 
											false, true, 125, false, true, 11, 10, 11, 10, 10, 10, 11, 10, 10, 10);
	
	private Equipment axe2h = new Equipment(2, 1, 
			"Zweihändisches Axt", "Eine schwere Axt, mit ihr wird aus jedem Monster schnell Kleinholz.", 
											false, true, 125, false, true, 12, 10, 14, 10, 10, 10, 11, 10, 10, 10);
	
	private Equipment helmet1 = new Equipment(3, 2, 
			"Helm", "Gehört in die Ausrüstung jedes Helden. Beweise Köpfchen indem du ihn Schützt.", 
											false, true, 80, false, false, 10, 10, 10, 10, 10, 10, 14, 10, 10, 10);
	
	private Equipment helmet2 = new Equipment(4, 2, 
			"Gehörnter Helm", "Erschreckt Menschen und Ungeheuer gleichermassen.", 
											false, true, 105, false, false, 10, 10, 10, 10, 10, 11, 13, 10, 10, 10);
	
	private Equipment armor1 = new Equipment(5, 3, 
			"Leder Weste", "Eine Weste aus Leder. Bietet wenig schutz, ist aber leicht und wendig.", 
											false, true, 70, false, false, 7, 10, 10, 10, 10, 10, 10, 10, 12, 11);
	
	private Equipment armor2 = new Equipment(6, 3, 
			"Kettenhemd", "Bietet guten schutz und beweglichkeit, nur das Klieren nervt.", 
											false, true, 80, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	
	private Equipment armor3 = new Equipment(7, 3, 
			"Brustpanzer", "Egal ob Klingen, Keulen oder Klauen mit dieser Brustpanzer bist du gegen alles gewappnet.", 
											false, true, 80, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	
	private Equipment boots1 = new Equipment(8, 4, 
			"Sandalen", "Einfaches Schuhwerk schützt deine Fühse vor spitzen Steinen, viel mehr aber auch nicht.", 
											false, true, 80, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	
	private Equipment boots2 = new Equipment(9, 4, 
			"Kampfstiefel", "Diese Stiefen schützen dich vor Feind und Wetter,ohne zuviel konfort einzubüssen.", 
											false, true, 80, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);

	private Equipment boots3 = new Equipment(10, 4, 
			"Gepanzerte Stiefel", "Selbst wen dir ein Minotaure auf die Füße Tritt brauchst du keine Angst um deine Zehen zu haben.", 
											false, true, 80, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	
	private Equipment shield1 = new Equipment(11, 5, 
			"Holzschild", "Mehere Holzbretter die zusammengenagelt wurden. Besser das Schild wird gespalten, als dein Kopf", 
											false, true, 80, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	
	private Equipment shield2 = new Equipment(12, 5, 
			"", "Gehört in die Ausrüstung jedes Helden. Beweise Köpfchen indem du ihn Schützt", 
											false, true, 80, false, false, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	
	public void fillList()
	{
		equipmentList.add(sword1h);
		
		equipmentList.add(sword2h);
		
		equipmentList.add(axe2h);
		
		equipmentList.add(helmet1);
		
		equipmentList.add(helmet2);
		
		equipmentList.add(armor1);
		
		equipmentList.add(armor2);
		
		equipmentList.add(armor3);
		
		equipmentList.add(boots1);
		
		equipmentList.add(boots2);
		
		equipmentList.add(boots3);
		
		equipmentList.add(shield1);
		
		equipmentList.add(shield2);
	}
	public Equipment getEquipment(int id)
	{
		return equipmentList.get(id);
	}
	public ArrayList<Equipment> getEquipmentList()
	{
		return equipmentList;
	}
}
