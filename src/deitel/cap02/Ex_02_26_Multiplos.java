package deitel.cap02;

import java.util.Scanner;

public class Ex_02_26_Multiplos {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int inteiro1, inteiro2, resto;
		System.out.print("Insira o primeiro inteiro: ");
		inteiro1 = input.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		inteiro2 = input.nextInt();
		input.close();
		resto = inteiro1 % inteiro2;
		if (resto == 0) {
			System.out.printf("%d é múltiplo de %d.%n", inteiro1, inteiro2);
		}
		if (resto != 0) {
			System.out.printf("%d não é múltiplo de %d.%n ", inteiro1, inteiro2);
		}

	}
}
