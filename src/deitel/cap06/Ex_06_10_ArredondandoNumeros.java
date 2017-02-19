package deitel.cap06;

import java.util.Scanner;

public class Ex_06_10_ArredondandoNumeros {

	public static void main(String[] args) {
		System.out.print("Insira o número double: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		input.close();
		System.out.printf("x: %f%n", x);
		System.out.printf("roundToInteger: %d%n", roundToInteger(x));
		System.out.printf("roundToTenths: %f%n", roundToTenths(x));
		System.out.printf("roundToHundredths: %f%n", roundToHundredths(x));
		System.out.printf("roundToThousandths: %f%n", roundToThousandths(x));
		
	}

	public static int roundToInteger(double number) {
		return (int) Math.floor(number + 0.5);
	}

	public static double roundToTenths(double number) {
		return Math.floor(number * 10 + 0.5) / 10;
	}

	public static double roundToHundredths(double number) {
		return Math.floor(number * 100 + 0.5) / 100;
	}

	public static double roundToThousandths(double number) {
		return Math.floor(number * 1000 + 0.5) / 1000;
	}

}
