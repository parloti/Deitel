package deitel.cap06;

import java.util.Random;

public class Ex_06_16_Multiplos {

	public static void main(String[] args) {
		Random randomNumbers = new Random();
		for (int i = 0; i < 10; i++) {
			int primeiro = 1 + randomNumbers.nextInt(20);
			int segundo = 1 + randomNumbers.nextInt(100);
			System.out.printf("%d é multiplo %d?%n%b.%n", segundo, primeiro,isMultiple(primeiro, segundo));
		}
	}

	private static boolean isMultiple(int primeiro, int segundo) {
		return segundo % primeiro == 0;
	}

}
