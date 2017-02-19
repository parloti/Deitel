package deitel.cap06;

import java.util.Random;

public class Ex_06_13_ {

	public static void main(String[] args) {
		Random randomNumbers = new Random();

		System.out.println("Inteiro aleatórios no conjunto 2, 4, 6, 8, 10.");
		System.out.println(2 + 2 * randomNumbers.nextInt(5));
		System.out.println();

		System.out.println("Inteiro aleatórios no conjunto 3, 5, 7, 9, 11.");
		System.out.println(3 + 2 * randomNumbers.nextInt(5));
		System.out.println();

		System.out.println("Inteiro aleatórios no conjunto 6, 10, 14, 18, 22.");
		System.out.println(6 + 4 * randomNumbers.nextInt(5));
		System.out.println();
	}

}
