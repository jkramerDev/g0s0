/**
 * 
 * Location describes where and options from there
 * 
 * initialize with front door.
 * 
 * Based on direction & current location, state can be managed
 * 
 * @author jkramer
 *
 */


public class Location {
	
	private String currentLocation;
	
	/**
	 * initialize location at Front Door in your constructor
	 */
	public  Location() {
		currentLocation = "Front Door";
	}
	
	/**
	 * location accessor
	 * @return
	 */
	public String getLocation() {
		return currentLocation;
	}
	
	
	/**
	 * move() is a key method.  1st cut it's going to be big to handle different conditions.  
	 * eventually we'll break that logic out to smaller methods
	 * 
	 * @param direction
	 */
	
	
	public void move(String direction) {
		
		if(direction.equalsIgnoreCase("E")){
			
			if(currentLocation.equals("Front Door")) 
				currentLocation = "Kitchen";
			
			else if(currentLocation.equals("Kitchen")) 
				currentLocation = "Parlor";
			
			else if(currentLocation.equals("Attic"))
				System.out.println("Cant go East in attic..");
		
		} 

		
		else if(direction.equalsIgnoreCase("W")){
			System.out.println("where do u go if you go west from current room ");
		
		} 

		//... etc..
		
		
	
	}

}
