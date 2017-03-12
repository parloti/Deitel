package deitel.cap06;

import java.util.Scanner;

public class Ex_06_26_DigitosInvestidos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a número a ser invertido: ");
		String number = input.next();
		input.close();
		System.out.printf("O número invertido é: %s.%n", inverteDigitos(number));
	}

	private static String inverteDigitos(String number) {
		String invertedNumber = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			invertedNumber += number.charAt(i);
		}
		return invertedNumber;
	}
}
