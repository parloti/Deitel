package deitel.cap06;

import java.util.Scanner;

public class Ex_06_14_Exponenciacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a base da potencia: ");
		int base = input.nextInt();

		System.out.print("Informe o expoente da potencia: ");
		int exponent = input.nextInt();

		input.close();
		System.out.printf("O valor da potência é: %d.%n", integerPower(base, exponent));
	}

	public static int integerPower(int base, int exponent) {
		int pow = 1;
		for (int i = 0; i < exponent; i++) {
			pow = pow * base;
		}
		return pow;
	}

}
