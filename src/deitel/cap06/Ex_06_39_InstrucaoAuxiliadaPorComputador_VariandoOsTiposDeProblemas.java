package deitel.cap06;

import java.util.Random;
import java.util.Scanner;

public class Ex_06_39_InstrucaoAuxiliadaPorComputador_VariandoOsTiposDeProblemas {
	private static final Scanner input = new Scanner(System.in);
	private static final Random randomNumbers = new Random();
	private int successesCount = 0;
	private int errorsCount = 0;
	private int aswerCount = 0;
	private int dificuldade;
	private int operation;
	
	private static final int ADDITION = 1;
	private static final int SUBTRACTION = 2;
	private static final int MULTIPLICATION = 3;
	private static final int DIVISION = 4;
	private static final int ALL = 5;
	
	public void dificuldade() {
		System.out.println("Informe o grau de dificuldade desejado.");
		dificuldade = input.nextInt() * 10;
		questionType();
		generateQuestion();
	}
	
	private void questionType() {
		System.out.println("Escolha o tipo de problema a ser estudado:");
		System.out.println("Type 1 for ADDITION");
		System.out.println("Type 2 for SUBTRACTION");
		System.out.println("Type 3 for MULTIPLICATION");
		System.out.println("Type 4 for DIVISION");
		System.out.println("Type 5 for ALL");
		operation = input.nextInt();
	}
	
	public void generateQuestion() {
		int number1, number2;
		number1 = randomNumbers.nextInt(dificuldade);
		number2 = randomNumbers.nextInt(dificuldade);
		ask(calculation(number1, number2));
	}
	
	private int calculation(int number1, int number2) {
		int _operation;
		if (operation == ALL) {
			_operation = 1 + randomNumbers.nextInt(4);
		} else {
			_operation = operation;
		}
		switch (_operation) {
			case ADDITION:
				System.out.printf("How much is %d plus %d? ", number1, number2);
				return number1 + number2;
			case SUBTRACTION:
				if (number1 < number2) {
					int number = number1;
					number1 = number2;
					number2 = number;
				}
				System.out.printf("How much is %d minus %d? ", number1, number2);
				return number1 - number2;
			case MULTIPLICATION:
				System.out.printf("How much is %d times %d? ", number1, number2);
				return number1 * number2;
			default:
				if (number2 == 0) {
					number2 = 1;
				}
				System.out.printf("How much is %d divided by %d? ", number1, number2);
				return number1 / number2;
		}
	}
	
	private void ask(int correctAnswer) {
		int userAnswer = -1;
		do {
			aswerCount++;
			userAnswer = input.nextInt();
			if (userAnswer == correctAnswer) {
				System.out.println(msg(true));
				successesCount++;
				if (aswerCount < 10) {
					generateQuestion();
				} else {
					evaluation();
					new Ex_06_39_InstrucaoAuxiliadaPorComputador_VariandoOsTiposDeProblemas().dificuldade();
				}
			} else {
				System.out.println(msg(false));
				errorsCount++;
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
				default:
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
				default:
					return "No. Keep trying.";
			}
		}
	}
	
	private void evaluation() {
		int successesPercentage = 100 * successesCount / aswerCount;
		if (successesPercentage < 75) {
			System.out.println("Peça ajuda extra ao seu professor.");
		} else {
			System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");
		}
	}
}
