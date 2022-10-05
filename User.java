
/**
 * 
 * What's a user have in our game?
 * 
 * a name && location.
 * 
 * 
 * What can a user do?  
 * 
 * a user can move.
 * 
 * 
 * How will a user move?
 * use the Location move functionality...
 * 
 */


public class User {
	
	
	private String name;
	private Location location;

	public User() {
		location = new Location();
	}
	
	public void move(String direction) {
		
		//check for scoring opportunity..
		checkForScoringOp();
		
		location.move(direction);
	}
	
	/**
	 * scoring op: if based on direction && current location
	 * there is a scorable item...   do stuff...    
	 * 
	 * i.e., you went west from parlor, 
	 * maybe you find trap door do you want to look inside.
	 * if yes, you find an item.  do you pick it up...  etc
	 * 
	 * @return
	 */
	
	public void checkForScoringOp() {
		
	}
	
	public String getCurrentLocation() {
		return location.getLocation();
	}
	
	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}
	
	
 
}
