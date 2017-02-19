package deitel.cap04;

import java.util.Scanner;

public class Ex_04_35_LadosDeUmTriangulo {

	public static void main(String args[]) {
		//Condições de exitencia
		/*
		| b - c | < a < b + c
		| a - c | < b < a + c
		| a - b | < c < a + b
		 */
		double ladoA, ladoB, ladoC;
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro valor.");
		ladoA = input.nextDouble();
		System.out.println("Insira o segundo valor.");
		ladoB = input.nextDouble();
		System.out.println("Insira o terceiro valor.");
		ladoC = input.nextDouble();
		input.close();

		if (Math.abs(ladoB - ladoC) < ladoA && ladoA < ladoB + ladoC
				&& Math.abs(ladoA - ladoC) < ladoB && ladoB < ladoA + ladoC
				&& Math.abs(ladoA - ladoB) < ladoC && ladoC < ladoA + ladoB) {
			System.out.println("Os valores podem representar um triangulo.");
		}
		else{
			System.out.println("Os valores NAO podem representar um triangulo.");
		}
	}
}
