package util;

import java.util.Scanner;


/**
 * singleton pattern
 * 
 * @author jkramer
 *
 */
public class ScannerUtil {
	
	private static Scanner scanner;
	
	public static Scanner getInstance() {
		
		if(scanner == null)
			scanner = new Scanner(System.in);
		
		//always return 'the' scanner
		return scanner;
		
		
	}
	

}
