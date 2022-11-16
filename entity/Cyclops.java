package entity;

public class Cyclops extends Monster{

	
	
	public Cyclops(String name) {
		super(name);
 	}

	public void specialPower() {
		logger.debug("Crazy eye laser rays...   who knew?");
	}
	
	
}
