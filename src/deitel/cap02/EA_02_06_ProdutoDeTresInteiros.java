package deitel.cap02;

import java.util.Scanner;

public class EA_02_06_ProdutoDeTresInteiros {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int inteiro1, inteiro2, inteiro3, produto;
		System.out.print("Insira o primeiro inteiro: ");
		inteiro1 = input.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		inteiro2 = input.nextInt();
		System.out.print("Insira o terceiro inteiro: ");
		inteiro3 = input.nextInt();
		input.close();
		produto = inteiro1 * inteiro2 * inteiro3;
		System.out.printf("O produto dos três inteiros é %d.%n", produto);
	}
}
