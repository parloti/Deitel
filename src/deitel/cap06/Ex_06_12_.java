package deitel.cap06;

import java.util.Random;

public class Ex_06_12_ {

	public static void main(String[] args) {
		Random randomNumbers = new Random();

		System.out.print("Inteiro aleatórios no intervalo 1 <= n <= 2: ");
		System.out.println(1 + randomNumbers.nextInt(2));
		System.out.println();

		System.out.print("Inteiro aleatórios no intervalo 1 <= n <= 100: ");
		System.out.println(1 + randomNumbers.nextInt(100));
		System.out.println();

		System.out.print("Inteiro aleatórios no intervalo 0 <= n <= 9: ");
		System.out.println(randomNumbers.nextInt(10));
		System.out.println();

		System.out.print("Inteiro aleatórios no intervalo 1000 <= n <= 1112: ");
		System.out.println(1000 + randomNumbers.nextInt(113));
		System.out.println();

		System.out.print("Inteiro aleatórios no intervalo -1 <= n <= 1: ");
		System.out.println(-1 + randomNumbers.nextInt(3));
		System.out.println();

		System.out.print("Inteiro aleatórios no intervalo -3 <= n <= 11: ");
		System.out.println(-3 + randomNumbers.nextInt(15));
		System.out.println();
	}

}
