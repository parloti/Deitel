package deitel.cap07;

import deitel.cap07.Ex_07_18_JogoDeDadosCraps.Status;

public class Ex_07_18_JogoDeDadosCrapsTest {
	public static void main(String[] args) {
		int[][] occurrences = new int[2][22];
		int totalOverAllWon = 0;
		int diceReleasesOvelAll = 0;
		
		for (int i = 0; i < 1000; i++) {
			Ex_07_18_JogoDeDadosCraps game = new Ex_07_18_JogoDeDadosCraps();
			game.play();
			
			int diceReleases = Ex_07_18_JogoDeDadosCraps.rollDiceCount;
			diceReleasesOvelAll += diceReleases;
			
			System.out.println(Ex_07_18_JogoDeDadosCraps.gameStatus == null);
			if (Ex_07_18_JogoDeDadosCraps.gameStatus == Status.WON) {
				totalOverAllWon++;
				if (diceReleases < 21) {
					occurrences[0][diceReleases]++;
				} else {
					occurrences[0][21]++;
				}
			} else if (Ex_07_18_JogoDeDadosCraps.gameStatus == Status.LOST) {
				if (diceReleases < 21) {
					occurrences[1][diceReleases]++;
				} else {
					occurrences[1][21]++;
				}
			}
		}
		System.out.printf("%s%11s%20s%n", "Dices Rolls", "Won", "Lost");
		for (int i = 1; i < occurrences[0].length - 1; i++) {
			System.out.printf("%02d%20d%20d%n", i, occurrences[0][i], occurrences[1][i]);
		}
		System.out.printf("%d%20d%20d%n", 21, occurrences[0][21], occurrences[1][21]);
		
		System.out.printf("Total of on in 1000 try: %d%n", totalOverAllWon);
		System.out.printf("Average duration of the game is %d rolls.%n", diceReleasesOvelAll / 1000);
	}
}