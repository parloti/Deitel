package deitel.cap06;

import java.util.Random;
import java.util.Scanner;

public class Ex_06_38_InstrucaoAuxiliadaPorComputador_NiveisDeDificuldade {
	
	Scanner input = new Scanner(System.in);
	Random randomNumbers = new Random();
	int successesCount = 0;
	int errorsCount = 0;
	int aswerCount = 0;
	int dificuldade;
	
	public void dificuldade() {
		System.out.println("Informe o grau de dificuldade desejado.");
		dificuldade = input.nextInt() * 10;
		generateQuestion();
	}
	
	public void generateQuestion() {
		int number1, number2;
		number1 = randomNumbers.nextInt(dificuldade);
		number2 = randomNumbers.nextInt(dificuldade);
		System.out.printf("How much is %d times %d? ", number1, number2);
		ask(number1 * number2);
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
					new Ex_06_38_InstrucaoAuxiliadaPorComputador_NiveisDeDificuldade().dificuldade();
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
	
	private void evaluation() {
		int successesPercentage = 100 * successesCount / aswerCount;
		if (successesPercentage < 75) {
			System.out.println("Peça ajuda extra ao seu professor.");
		} else {
			System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");
		}
	}
}
