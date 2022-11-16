package app;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import entity.ScorableItems;
import entity.User;
import util.Constants;
import util.DIRECTION;
import util.ScannerUtil;

public class App {

	Logger logger = Logger.getLogger(App.class);

	ScorableItems items;

	public static void main(String[] args) {
		BasicConfigurator.configure();
		App app = new App();
		app.process();
	}

	/**
	 * main interactive loop of program
	 * 
	 */

	public void process() {

		items = new ScorableItems();

		User user = new User();
	//	Scanner scanner = new Scanner(System.in);
		
		Scanner scanner = ScannerUtil.getInstance();
		

		// initial message
		logger.info(Constants.INITIAL_MESSAGE);

		String choice;
		 
		while (user.getPoints() <= 50 || !user.isDefeatedMonster()) { 
				
			
			logger.debug("Please make a selection..");
			choice = scanner.nextLine();
			 
			switch (DIRECTION.valueOf(choice.toUpperCase())) {
				case E:
					logger.debug("You've selected East...\n");
					user.move(DIRECTION.E.toString(), items);
					break;
	
				case S:
					logger.debug("You've selected South...\n");
					user.move(DIRECTION.S.toString(), items);
					break;
	
				case N:
					logger.debug("You've selected North...\n");
					user.move(DIRECTION.N.toString(), items);
					break;
	
				case W:
					logger.debug("You've selected West...\n");
					user.move(DIRECTION.W.toString(), items);
					break;
	
				case H:
					Help.printMap();
					break;
	
					
				default:
					logger.debug("Your request is not understood, please try again...");
					break;
				}

			logger.debug("Your current location is: " + user.getPosition());
			logger.debug("You have " + user.getPoints() + " points");
			logger.debug("It's: [" + user.isDefeatedMonster() + "] you have defeated a monster ");

			user.showOptions();
		}

		logger.debug(Constants.WON_MESSAGE);
	}
}
