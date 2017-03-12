package deitel.cap06;

import java.util.Random;
import java.util.Scanner;

public class Ex_06_37_InstrucaoAuxiliadaPorComputador_MonitorandoODesempenhoDoAluno {
	
	Scanner input = new Scanner(System.in);
	Random randomNumbers = new Random();
	int successesCount = 0;
	int errorsCount = 0;
	int aswerCount = 0;
	
	public void generateQuestion() {
		int number1, number2;
		number1 = randomNumbers.nextInt(10);
		number2 = randomNumbers.nextInt(10);
		System.out.printf("How much is %d times %d? ", number1, number2);
		ask(number1 * number2);
	}
	
	private void ask(int correctAnswer) {
		int userAnswer = -1;
		do {
			aswerCount++;
			userAnswer = input.nextInt();
			if (aswerCount < 10) {
				if (userAnswer == correctAnswer) {
					System.out.println(msg(true));
					successesCount++;
					generateQuestion();
				} else {
					System.out.println(msg(false));
					errorsCount++;
				}
			} else {
				evaluation();
				new Ex_06_37_InstrucaoAuxiliadaPorComputador_MonitorandoODesempenhoDoAluno().generateQuestion();
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
