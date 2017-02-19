package deitel.cap02;

import java.util.Scanner;

public class Ex_02_16_ComparandoInteiros {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int number1, number2;
		System.out.print("Insira o primeiro inteiro: ");
		number1 = input.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		number2 = input.nextInt();
		input.close();

		if (number1 > number2) {
			System.out.printf("%d is larger.%n", number1);
		}
		if (number1 < number2) {
			System.out.printf("%d is larger.%n", number2);
		}
		if (number1 == number2) {
			System.out.printf("These numbers are equal.%n");
		}
	}
}
