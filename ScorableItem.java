import java.util.HashMap;
import java.util.Map;

public class ScorableItem {

	private Map<String, Integer> items;
	private int score;
	
	//ctor
	public ScorableItem() {
		items = new HashMap<>();
		init();
	}
	
	/**
	 * show what's in the map
	 */
	public void displayCurrentItems() {
		//use an ITERATOR and a SET!
	}
	
	
	/**
	 * Check if key exists in map.  
	 * If so, get value from map & add to score
	 * 
	 * 
	 * @param key
	 * @return
	 */
	
	public Integer getItem(String key) {
			
		return -1;
	}
	
	
	/**
	 * load the map with items & their values
	 */
	private void init() {
		items.put("water", 5);
		items.put("bad cheese", -5);
		items.put("candy bar", 10);
		//load a bunch...
		
		
	}
	
}
