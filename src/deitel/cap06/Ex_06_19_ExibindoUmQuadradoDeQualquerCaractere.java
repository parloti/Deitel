package deitel.cap06;

import java.util.Scanner;

public class Ex_06_19_ExibindoUmQuadradoDeQualquerCaractere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o tamanho do lado do retângulo: ");
		int side = input.nextInt();
		squareOfAsterisks(side);
		input.close();

	}

	private static void squareOfAsterisks(int side) {
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
