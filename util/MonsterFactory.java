package util;

import entity.Cyclops;
import entity.Minator;
import entity.Monster;
import entity.Troll;

public class MonsterFactory {

	public static Monster create(CREATURE type, String name) {

		Monster monster = null;
		
		if (type.equals(CREATURE.CYCLOPS)) {
			monster = new Cyclops(name);
		} else if (type.equals(CREATURE.TROLL)) {
			monster = new Troll(name);
		} else if (type.equals(CREATURE.MINATOUR)) {
			monster = new Minator(name);
		} else
			System.out.println(" Fresh out of monsters...");

		return monster;
	}
}
