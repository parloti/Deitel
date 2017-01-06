package deitel.cap02;

import java.util.Scanner;

public class Ex_02_17_AritmeticaMenorEMaior {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int number1, number2, number3, sum, average, product, max = 0, min = 0;
		System.out.print("Insira o primeiro inteiro: ");
		number1 = input.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		number2 = input.nextInt();
		System.out.print("Insira o terceiro inteiro: ");
		number3 = input.nextInt();

		sum = number1 + number2 + number3;
		average = sum / 3;
		product = number1 * number2 * number3;

		if (number1 >= number2) {
			if (number1 >= number3) {
				max = number1;
			}
		}
		if (number2 >= number1) {
			if (number2 >= number3) {
				max = number2;
			}
		}
		if (number3 >= number1) {
			if (number3 >= number2) {
				max = number3;
			}
		}

		if (number1 <= number2) {
			if (number1 <= number3) {
				min = number1;
			}
		}
		if (number2 <= number1) {
			if (number2 <= number3) {
				min = number2;
			}
		}
		if (number3 <= number1) {
			if (number3 <= number2) {
				min = number3;
			}
		}

		System.out.printf("A soma é %d.%n", sum);
		System.out.printf("A média é %d.%n", average);
		System.out.printf("O produto é %d.%n", product);
		System.out.printf("O menor é %d.%n", min);
		System.out.printf("O maior é %d.%n", max);
	}
}
