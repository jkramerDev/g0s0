package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
 
import service.LocationService;
import util.CREATURE;
import util.Constants;
import util.MonsterFactory;
import util.ROOM;
import util.ScannerUtil;

public class User {
	
	// A user has-a: map, location, List<Items> , points 	
	private LocationService location;
	private List<String> currentItems;
	private int points = 0;
	private boolean defeatedMonster = false;


	Logger logger = Logger.getLogger(User.class);
 
	
	public User() {
		currentItems = new ArrayList<>();
		location = new LocationService();
		location.setPosition(Constants.STARTING_POSITION);	
 	}
	
 
	public void move(String direction, ScorableItems items) {
		location.move(direction);
	 	checkForScoring(direction, items);
	 	checkForMonster(direction);
			
	}

	//TODO - this is one option to score, add more..
	private void checkForScoring(String direction, ScorableItems items) {
		if(location.getCurrentPosition().equals(ROOM.ATTIC.toString()) && direction.equals("N") && !currentItems.contains("lamp")) {
			System.out.println("Score...  maybe!  there is a secret panel, would you like to reach inside?  Y/N ");
			System.out.println("The possiblities are: " );
			items.displayCurrentItems();
			
			Scanner s = ScannerUtil.getInstance();
			
			String response = s.nextLine();
			if(response.equalsIgnoreCase(Constants.Y)) {
				logger.debug("Well done, you found a Lamp - worth 10 points! " );
				currentItems.add("lamp");
				points += items.getItem("lamp");
			}else {
				logger.debug("OK, better luck next time.." );
			}
		}
	}
	
	//TODO  - simple options to fight monster..  add more
	private void checkForMonster(String direction) {
		Monster monster = null;
		boolean battleResults = false;
		
		//Get the monster
		if(location.getCurrentPosition().equals(ROOM.BASEMENT.toString()) && direction.equals("S") && !defeatedMonster) {
			System.out.println("You have crept up on a MONSTER...");
			 monster = MonsterFactory.create(CREATURE.MINATOUR, "mini");;
		}
		
		else if(location.getCurrentPosition().equals(ROOM.KITCHEN.toString()) && direction.equals("W") && !defeatedMonster) {
			System.out.println("You have crept up on a MONSTER...");
			 monster = MonsterFactory.create(CREATURE.CYCLOPS, "winki");
		}

		//do monster stuff
		if(monster!= null) {
			monster.eat();;
			monster.sound();
			monster.specialPower();
			battleResults = monster.battle();
			defeatedMonster = battleResults;
		}
	}


	
 
	
	public void showOptions() {
		location.printCurrentOptions();
	}
	
	public String getPosition() {
		return location.getCurrentPosition();
	}


	public List<String> getCurrentItems() {
		return currentItems;
	}


	public void setItems(List<String> items) {
		this.currentItems = items;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}

	public boolean isDefeatedMonster() {
		return defeatedMonster;
	}


	public void setDefeatedMonster(boolean defeatedMonster) {
		this.defeatedMonster = defeatedMonster;
	}

}
