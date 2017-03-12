package deitel.cap06;

import java.util.Random;
import java.util.Scanner;

public class Ex_06_33_ModificacaoDoJogoCraps {

	private static final Random randomNumbers = new Random();
	private static final Scanner input = new Scanner(System.in);

	private enum Status {
		CONTINUE, WON, LOST
	};

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	private double bankBalance = 1000.0;

	public void play() {
		int myPoint = 0;
		double wager = 0;
		Status gameStatus;

		do {
			System.out.println("Insert a wager.");
			wager = input.nextDouble();
		} while (wager <= 0 || wager > bankBalance);
		input.close();

		int sumOfDice = rollDice();

		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d\n", myPoint);
			break;
		}

		while (gameStatus == Status.CONTINUE) {
			chat(gameStatus);

			sumOfDice = rollDice();

			if (sumOfDice == myPoint)
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN)
				gameStatus = Status.LOST;
		}

		if (gameStatus == Status.WON) {
			bankBalance += wager;
			System.out.printf("Player wins.%nBank Balance: %,.2f.%n", bankBalance);
			
		} else {
			bankBalance -= wager;
			if (bankBalance <= 0) {
				System.out.println("Sorry. You busted!");
			} else {
				System.out.printf("Player loses.%nBank Balance: %,.2f.%n", bankBalance);
			}
		}
	}

	public int rollDice() {

		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);

		int sum = die1 + die2;

		System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);

		return sum;
	}

	private void chat(Status gameStatus) {
		int msg = randomNumbers.nextInt(3);
		switch (msg) {
		case 0:
			if (gameStatus == Status.WON) {
				System.out.println("You're up big. Now's the time to cash in your chips!");
			} else {
				System.out.println("Oh, you're going for broke, huh?");
			}
		case 1:
			System.out.println("Aw c'mon, take a chance!");
		}
	}

}
