package deitel.cap06;

import java.util.Scanner;

public class Ex_06_23_EncontrarOMinimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a primeiro numero: ");
		double primeiro = input.nextDouble();
		System.out.print("Informe a segundo numero: ");
		double segundo = input.nextDouble();
		System.out.print("Informe a terceiro numero: ");
		double terceiro = input.nextDouble();
		input.close();
		System.out.printf("O menor número é: %,.2f.%n", minimum3(primeiro, segundo, terceiro));
	}

	private static double minimum3(double a, double b, double c) {
		return Math.min(a, Math.min(b, c));
	}

}
