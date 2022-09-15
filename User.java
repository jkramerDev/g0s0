
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
		location.move(direction);
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
