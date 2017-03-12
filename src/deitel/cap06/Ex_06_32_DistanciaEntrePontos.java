package deitel.cap06;

import java.util.Scanner;

public class Ex_06_32_DistanciaEntrePontos {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double x1, x2, y1, y2;
		System.out.println("Insira a coordenada x do ponto 1.");
		x1 = input.nextDouble();
		System.out.println("Insira a coordenada y do ponto 1.");
		y1 = input.nextDouble();
		System.out.println("Insira a coordenada x do ponto 2.");
		x2 = input.nextDouble();
		System.out.println("Insira a coordenada y do ponto 2.");
		y2 = input.nextDouble();
		input.close();
		System.out.printf("A distância entre os pontos é %,.2f.%n", distance(x1, y1, x2, y2));
	}

	private static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
