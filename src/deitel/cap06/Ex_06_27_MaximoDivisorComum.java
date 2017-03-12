package deitel.cap06;

import java.util.Scanner;

public class Ex_06_27_MaximoDivisorComum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int number1 = input.nextInt();
		System.out.print("Informe o segundo número: ");
		int number2 = input.nextInt();
		input.close();
		System.out.printf("O MDC é: %s.%n", MDC(number1, number2));
	}

	private static int MDC(int number1, int number2) {
		int larger = Math.max(number1, number2);
		int smaler = Math.min(number1, number2);
		int difference = larger - smaler;
		if (difference == smaler) {
			return difference;
		}
		else{
			return MDC(difference, smaler);
		}
	}
}
