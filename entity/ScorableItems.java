package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import app.App;
 

/**
 * 
 * Map of items in your Adventure.
 * 
 * Support:  
 * - iterating thru the map, 
 * - 'getting' an item: removes it from what's available
 * 
 * @author jkramer
 *
 */

public class ScorableItems {

	Map<String, Integer> items;

	Logger logger = Logger.getLogger(App.class);
	
	
	public ScorableItems() {
		items = new HashMap<>();
		init();
	}
	
	private void init() {
		items.put("lamp", 10);
		items.put("gold", 30);
		items.put("poison", -15);
		items.put("cash", 20);
		items.put("Powersauce", 10);
		items.put("food", 20);
		items.put("water", 20);
		items.put("poison ivy", -10);
		
	}
	
	public void displayCurrentItems() {
		
		Set<String> s = items.keySet();
		Iterator<String> iter = s.iterator();
		
		System.out.println("Currently available items");
		while( iter.hasNext()){
			String key = iter.next();
			logger.debug(key + ": " + items.get(key));
		}
	}

	/**
	 * return points to requester, remove item from the map of available.
	 * 
	 * @param key
	 * @return
	 */
	
	public Integer getItem(String key) {
		Integer points = items.get(key);
		items.remove(key);
		return points;
		
	}
}
