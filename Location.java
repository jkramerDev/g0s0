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
	private static final String FRONT_DOOR = "Front Door";
	private static final String KITCHEN = "Kitchen";
	private static final String ATTIC = "Attic";
	private static final String E = "E";
	private static final String N = "N";	
	
	/**
	 * initialize location at Front Door in your constructor
	 */
	public  Location() {
		currentLocation = FRONT_DOOR;
	}
	
	/**
	 * location accessor
	 * @return
	 */
	public String getLocation() {
		return currentLocation;
	}
 	
	
	/**
	 * break this down to use some helper methods..   moving parts?  direction & current location..
	 * @param direction
	 */
	
	public void move(String direction) {
		
		
		switch (currentLocation) {
			case FRONT_DOOR:
				handleFrontDoorMove(direction);
				break;
				
			case KITCHEN:
				handleKitchenMove(direction);
				break;

			//.. other rooms.
			
			default:
				System.out.println("Cant get there from here..");
	
				
		}				
				 
		
	}

	private void handleFrontDoorMove(String direction) {
		switch (direction) {
			case E:
				currentLocation = KITCHEN;
				break;
				
			case N:
				currentLocation = ATTIC;
							 
				break;
	
			//.. other directions..
			
			default:
				System.out.println("Cant get there from here..");

			
		}
		
	}
	private void handleKitchenMove(String direction) {
		switch (direction) {
			case "E":
				currentLocation = "Parlor";
				break;
				
			case "N":
				System.out.println("Cant get there from here..");
							 
				break;
	
			//.. other directions..
			
			default:
				System.out.println("Cant get there from here..");

			
		}
		
	}
	
	
}
