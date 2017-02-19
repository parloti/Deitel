package deitel.cap06;

import java.util.Scanner;

public class Ex_06_20_AreaDeCirculo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o raio do circulo: ");
		double rad = input.nextDouble();
		System.out.printf("A area do circulo é %,.2f.%n", circleArea(rad));
		input.close();
	}

	private static double circleArea(double rad) {
		return 2 * Math.PI * rad;
	}

}
