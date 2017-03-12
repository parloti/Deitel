package deitel.cap06;

import java.util.Scanner;

public class Ex_06_28_ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int media = 0;
		do {
			System.out.print("Informe a média do aluno: ");
			media = input.nextInt();
			if(0 > media || media > 100){
				System.out.println("Média inválida.");
			}
		} while (0 > media || media > 100);
		input.close();
		System.out.printf("A pontuação do aluno é: %d.%n", qualityPoints(media));
	}

	private static int qualityPoints(int media) {
		if (90 <= media && media <= 100) {
			return 4;
		} else if (80 <= media && media < 90) {
			return 3;
		} else if (70 <= media && media < 79) {
			return 3;
		} else if (60 <= media && media < 69) {
			return 1;
		} else {
			return 0;
		}
	}
}
