import java.util.Scanner;

//comment
public class App {

	public static void main(String[] args) {
		App app = new App();
		app.process();

	}
// helloooo
	/**
	 * main interactive loop of program
	 * 
	 */

	public void process() {

		
		System.out.println("-- let's play! -- ");

		User player1 = new User();
		
		Scanner s = new Scanner(System.in);
		System.out.println("-- What's ur name player1:  -- ");
		
		
		String name = s.nextLine();
		
		player1.setName(name);

		
		while(true) {
			
			System.out.println("Press 'H' for Help");

			
			System.out.println("U can go E/W/S/N - choose");

			String nextMove = s.nextLine();
			
			if(nextMove.equalsIgnoreCase("H"))
				Help.printMap();
			else
				player1.move(nextMove);
			
			System.out.println("u are here: " + player1.getCurrentLocation());
			System.out.println("****");

			
			
			
		}
		
	}
}
