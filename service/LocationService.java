package service;

import org.apache.log4j.Logger;
 
import util.ROOM;

public class LocationService {

	private String currentPosition;
	private String optionNorth;  
	private String optionSouth;  
	private String optionEast;  
	private String optionWest;  

	Logger logger = Logger.getLogger(LocationService.class);
	

	
	public void setPosition(String currentPosition) {
		this.setCurrentPosition(currentPosition);
	}
	
	public void move(String direction) {
		
		if(getCurrentPosition().equals(ROOM.FOYER.toString())) {
			handleFoyerMove(direction);
		}
		
		else if(getCurrentPosition().equals(ROOM.KITCHEN.toString())) {
			handleKitchenMove(direction);
		}
		
		else if(getCurrentPosition().equals(ROOM.ATTIC.toString())) {
			handleAtticMove(direction);
		}
		
		else if(getCurrentPosition().equals(ROOM.BASEMENT.toString())) {
			handleBasementMove(direction);
		}
	}
	
	private void handleFoyerMove(String direction) {
		if(direction.equals("E")) {
			setCurrentPosition(ROOM.KITCHEN.toString());
			setKitchenOptions();
		}
		if(direction.equals("W")) {
			setFoyerOptions();
		}
		if(direction.equals("S") || direction.equals("N")) {
			System.out.println("Not much going on in that direction..");
		}
	 	
	}
	
	private void handleKitchenMove(String direction) {
		if(direction.equals("N")) {
			setCurrentPosition(ROOM.ATTIC.toString());
			setAtticOptions();
		}
		if(direction.equals("E")) {
			setCurrentPosition(ROOM.FOYER.toString());
			setFoyerOptions();
		}
		if(direction.equals("S")) {
			setCurrentPosition(ROOM.BASEMENT.toString());
			setBasementOptions();
		}
		if(direction.equals("W") ) {
			System.out.println("Not much going on in that direction..");
		}
		
	}
	 
	
	private void handleAtticMove(String direction) {
		if(direction.equals("S")) {
			setCurrentPosition(ROOM.KITCHEN.toString());
			setKitchenOptions();
		}
		if( direction.equals("W") || direction.equals("E")) {
			System.out.println("Not much going on in that direction..");
		}
		if(direction.equals("N")) {
			
		}
			
	}
	
	private void handleBasementMove(String direction) {
		if(direction.equals("N")) {
			setCurrentPosition(ROOM.KITCHEN.toString());
			setKitchenOptions();
		}
		if(direction.equals("S") || direction.equals("W") || direction.equals("E")) {
			logger.debug("Not much going on in that direction..");
		}
	}
	
	
	private void setKitchenOptions() {
		optionSouth = "You see stairs heading down, it's dimly lit..";
		optionNorth = "You see stairs heading up, there are distant noises..";
		optionWest = "You see a door with smudges on it..";
		optionEast = "You see the spot you came from..";
	}
	
	private void setAtticOptions() {
		optionSouth = "You see stairs heading down, it looks remotely familiar..";
		optionNorth = "--";
		optionWest = "--.";
		optionEast = "--";
	}
	private void setBasementOptions() {
		optionSouth = "--";
		optionNorth = "You see stairs heading up, there are distant noises..";
		optionWest = "--";
		optionEast = "--";
	}

	private void setFoyerOptions() {
		optionSouth = "None..";
		optionNorth = "None..";
		optionWest = "You see a door with greasy fingerprints ..";
		optionEast = "You see the spot you came from..";
	}
	
	public void printCurrentOptions() {
		logger.debug("\n***");
		logger.debug("[South]: " + optionSouth);
		logger.debug("[North]: " + optionNorth);
		logger.debug("[West]: " + optionEast);
		logger.debug("[East]: " + optionWest);
		logger.debug("\n***\n");
	}

	public String getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}
	
}
