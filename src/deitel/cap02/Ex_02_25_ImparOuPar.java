package deitel.cap02;

import java.util.Scanner;

public class Ex_02_25_ImparOuPar {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int inteiro, resto;
		System.out.print("Insira o inteiro: ");
		inteiro = input.nextInt();
		resto = inteiro % 2;
		if (resto == 0) {
			System.out.printf("%d é par.%n", inteiro);
		}
		if (resto != 0) {
			System.out.printf("%d é ímpar.%n", inteiro);
		}
	}
}
