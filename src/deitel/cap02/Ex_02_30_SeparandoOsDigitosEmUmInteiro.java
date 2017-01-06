package deitel.cap02;

import java.util.Scanner;

public class Ex_02_30_SeparandoOsDigitosEmUmInteiro {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Insira um inteiro com 5 dígitos: ");
		number = input.nextInt();
		System.out.printf("%d   ", number % 100000 / 10000);
		System.out.printf("%d   ", number % 10000 / 1000);
		System.out.printf("%d   ", number % 1000 / 100);
		System.out.printf("%d   ", number % 100 / 10);
		System.out.printf("%d   ", number % 10 / 1);
	}
}
