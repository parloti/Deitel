package deitel.cap06;

import java.util.Random;

public class Ex_06_17_ParOuImpar {

	public static void main(String[] args) {
		Random randomNumbers = new Random();
		for (int i = 0; i < 10; i++) {
			int number = 1 + randomNumbers.nextInt(100);
			System.out.printf("%d é par?%n%b.%n", number, isEven(number));
		}
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
