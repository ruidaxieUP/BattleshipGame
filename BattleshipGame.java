//Zhiyuan 4.2

package battleship;

import java.util.Scanner;

public class BattleshipGame {

	public BattleshipGame() {
		gameSetup();
	}


	/**
	 * Scan player's input
	 * @param scan
	 * @return true if the player's answer starts with 'Y' or 'y', false otherwise
	 */
	public static boolean getYesOrNoFromPlayer(Scanner scan) {
		String playerAnswer = scan.next();
		if ((playerAnswer.charAt(0) == 'y') | (playerAnswer.charAt(0) == 'Y')) {
			return true;
		}
		return false;
	}


	/**
	 * set up the game; accept ”shots” from the user; display the results; print final scores; 
	 * and ask the user if he/she wants to play again.
	 * @param args
	 */
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Battleship Game!");
		System.out.println("You will play against the computer on a 10 by 10 ocean");
		System.out.println("Would you like to start? (y or n)");

		boolean getStarted = BattleshipGame.getYesOrNoFromPlayer(scan);

		
			Ocean ocean = new Ocean();
			ocean.placeAllShipsRandomly();
			Scanner scanner = new Scanner(System.in);
			
			//for checking whether the ships were placed correctly
			//print the location of ships visually
			ocean.printWithShips();
			
			while(!ocean.isGameOver()) {
				
				//print the ocean
				ocean.print();
				System.out.println("Hit count " + ocean.getHitCount());
				
				//get user input
				System.out.println("Enter row and enter column in the form of row,column (e.g. 3,4)");
				String userInput = scanner.next();
				String [] userInputParts = userInput.split(",");
				
				String rowString = userInputParts[0];
				String columnString = userInputParts[1];
				
				
				int row = Integer.parseInt(rowString);
				
				int column = Integer.parseInt(columnString);
				
				//shoot at the location with the given row and column
				
				
				
			}
			
			System.out.println("Game Over!");
			System.out.println("Your total shots are " + ocean.getShotsFired());
			
			//ask the user whether wants to play again
			System.out.println("Play again? (y/n)");
			if (BattleshipGame.getYesOrNoFromPlayer(scanner)) {
				
			}






	}
}