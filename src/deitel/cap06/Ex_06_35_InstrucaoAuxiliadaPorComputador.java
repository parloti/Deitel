package deitel.cap06;

import java.util.Random;
import java.util.Scanner;

public class Ex_06_35_InstrucaoAuxiliadaPorComputador {
	
	Scanner input = new Scanner(System.in);
	Random randomNumbers = new Random();
	
	public void generateQuestion() {
		int number1, number2;
		number1 = randomNumbers.nextInt(10);
		number2 = randomNumbers.nextInt(10);
		System.out.printf("How much is %d times %d?", number1, number2);
		ask(number1 * number2);
	}
	
	private void ask(int correctAnswer) {
		int userAnswer;
		do {
			userAnswer = input.nextInt();
			if (userAnswer == correctAnswer) {
				System.out.println("Very good!");
				generateQuestion();
			} else {
				System.out.println("No. Please try again.");
			}
		} while (userAnswer == correctAnswer);
	}
}
