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

		if (getStarted) {
			Ocean ocean = new Ocean();
			ocean.placeAllShipsRandomly();
			Scanner scanner = new Scanner(System.in);

		}






	}
}