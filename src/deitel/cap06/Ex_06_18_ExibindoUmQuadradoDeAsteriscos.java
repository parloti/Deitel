package deitel.cap06;

import java.util.Scanner;

public class Ex_06_18_ExibindoUmQuadradoDeAsteriscos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o tamanho do lado do retângulo: ");
		int side = input.nextInt();
		System.out.print("Informe o caractere para preencher o retângulo: ");
		char fillCharacter = input.next().charAt(0);
		squareOfAsterisks(side, fillCharacter);
		input.close();

	}

	private static void squareOfAsterisks(int side, char fillCharacter) {
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				System.out.print(fillCharacter);
			}
			System.out.println("");
		}
	}
}
