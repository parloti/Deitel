package deitel.cap04;

import java.util.Scanner;

public class Ex_04_36_LadosDeUmTrianguloDireito {

	public static void main(String args[]) {
		//Condições de exitencia
		/*
		a^2 = b^2 + c^2 ou 
		b^2 = a^2 + c^2 ou
		c^2 = b^2 + a^2
		 */
		double ladoA, ladoB, ladoC;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Insira o primeiro valor.");
		ladoA = keyboard.nextDouble();
		System.out.println("Insira o segundo valor.");
		ladoB = keyboard.nextDouble();
		System.out.println("Insira o terceiro valor.");
		ladoC = keyboard.nextDouble();

		if (Math.pow(ladoA, 2) == Math.pow(ladoB, 2) + Math.pow(ladoC, 2)
				|| Math.pow(ladoB, 2) == Math.pow(ladoA, 2) + Math.pow(ladoC, 2)
				|| Math.pow(ladoC, 2) == Math.pow(ladoB, 2) + Math.pow(ladoA, 2)) {
			System.out.println("Os valores podem representar um triangulo direito.");
		} else {
			System.out.println("Os valores NAO podem representar um triangulo direito.");
		}
	}
}
