package deitel.cap04;

import java.util.Scanner;

public class Ex_04_37_A_Fatorial {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe um inteiro positivo para caculo do seu fatorial.");
		int n = keyboard.nextInt();
		int fatorial = 1;
		for (int i = 2; i <= n; i++) {
			fatorial *= i;
		}
		System.out.printf("O fatorial de %d %c %d.%n", n, 233, fatorial);
	}
}
