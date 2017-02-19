package deitel.cap06;

import java.util.Scanner;

public class Ex_06_09_ArredondandoNumeros {
	public static void main(String[] args) {
		System.out.print("Insira o número double: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		input.close();
		double y = Math.floor(x + 0.5);
		System.out.printf("x: %,.2f%ny: %,.2f%n", x, y);
	}
}
