package deitel.cap02;

import java.util.Scanner;

public class Ex_02_32_ValoresNegativosPositivosEZero {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int inteiro1, inteiro2, inteiro3, inteiro4, inteiro5, positivos = 0, negativos = 0, zeros = 0;
		System.out.print("Insira o primeiro inteiro: ");
		inteiro1 = input.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		inteiro2 = input.nextInt();
		System.out.print("Insira o terceiro inteiro: ");
		inteiro3 = input.nextInt();
		System.out.print("Insira o quarto inteiro: ");
		inteiro4 = input.nextInt();
		System.out.print("Insira o quinto inteiro: ");
		inteiro5 = input.nextInt();
		if (inteiro1 > 0) {
			positivos = positivos + 1;
		}
		if (inteiro1 < 0) {
			negativos = negativos + 1;
		}
		if (inteiro1 == 0) {
			zeros = zeros + 1;
		}
		if (inteiro2 > 0) {
			positivos = positivos + 1;
		}
		if (inteiro2 < 0) {
			negativos = negativos + 1;
		}
		if (inteiro2 == 0) {
			zeros = zeros + 1;
		}
		if (inteiro3 > 0) {
			positivos = positivos + 1;
		}
		if (inteiro3 < 0) {
			negativos = negativos + 1;
		}
		if (inteiro3 == 0) {
			zeros = zeros + 1;
		}
		if (inteiro4 > 0) {
			positivos = positivos + 1;
		}
		if (inteiro4 < 0) {
			negativos = negativos + 1;
		}
		if (inteiro4 == 0) {
			zeros = zeros + 1;
		}
		if (inteiro5 > 0) {
			positivos = positivos + 1;
		}
		if (inteiro5 < 0) {
			negativos = negativos + 1;
		}
		if (inteiro5 == 0) {
			zeros = zeros + 1;
		}

		System.out.printf("Positivos: %d.%n", positivos);
		System.out.printf("Negativos: %d.%n", negativos);
		System.out.printf("Zeros: %d.%n", zeros);
	}
}
