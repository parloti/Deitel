package deitel.cap06;

import java.util.Random;
import java.util.Scanner;

public class Ex_06_31_ModificacaoDeAdivinheONumero {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char option;

		do {
			play();
			System.out.println("Do you want play again?");
			System.out.println("y - Yes");
			System.out.println("n - Not");
			option = input.next().charAt(0);
		} while (option != 'n');
		input.close();

	}

	public static void play() {
		Random randomNumbers = new Random();

		int number = 1 + randomNumbers.nextInt(1000);
		int guess, guessCount = 0;

		System.out.println("Guess a number between 1 and 1000.");
		do {
			guess = input.nextInt();
			if (guess > number) {
				System.out.println("Too high. Try again.");
			} else if (guess < number) {
				System.out.println("Too low. Try again.");
			}
			guessCount++;
		} while (guess != number);
		System.out.println("Congratulations. You guessed the number.");
		if (guessCount < 10) {
			System.out.println("Either you know the secret or you got lucky!");
		} else if (guessCount == 10) {
			System.out.println("Aha! You know the secret!");
		} else if (guessCount > 10) {
			System.out.println("You should be able to do better!");
		}
	}

}
