package deitel.cap06;

import java.util.Random;
import java.util.Scanner;

public class Ex_06_36_InstrucaoAuxiliadaPorComputador_ReduzindoAFadigaDoAluno {
	
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
				System.out.println(msg(true));
				generateQuestion();
			} else {
				System.out.println(msg(false));
			}
		} while (userAnswer != correctAnswer);
	}
	
	private String msg(boolean userHit) {
		int msg = randomNumbers.nextInt(4);
		if (userHit) {
			switch (msg) {
				case 0:
					return "Very good!";
				case 1:
					return "Excellent!";
				case 2:
					return "Nice work!";
				case 3:
					return "Keep up the good work!";
			}
		} else {
			switch (msg) {
				case 0:
					return "No. Please try again.";
				case 1:
					return "Wrong. Try once more.";
				case 2:
					return "Don't give up!";
				case 3:
					return "No. Keep trying.";
			}
		}
		return "";
	}
}
