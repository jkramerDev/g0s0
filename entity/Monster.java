package entity;

import java.util.Random;

import org.apache.log4j.Logger;
 

public class Monster {

	Logger logger = Logger.getLogger(Monster.class);
	String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	public void eat() {
		logger.debug("I'll eat everything...!");
	}
	
	public void sound() {
		logger.debug("Arrggggg...!");
	}
	
	public void specialPower() {
		logger.debug("Regular old monster stuff...");
	}
	
	public boolean battle() {
		Random r = new Random();
	
		int monsterRoll = r.nextInt(10);
		int playerRoll = r.nextInt(10);
		
		logger.debug("Monster roll: " + monsterRoll);
		logger.debug("Player roll: " + playerRoll);
		
		if(monsterRoll > playerRoll) {
			logger.debug("Monster wins!  ");
			return false;
		}
		else {
			logger.debug("Player wins!  ");
			return true;
		}	
	}
}
