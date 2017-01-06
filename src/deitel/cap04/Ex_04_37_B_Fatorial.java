package deitel.cap04;

import java.util.Scanner;

public class Ex_04_37_B_Fatorial {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe o numero de termos a calcular.");
		int termos = keyboard.nextInt();
		double e = 0;
		for (int i = 0; i < termos; i++) {
			e += 1.0/Fatorial(i);
		}
		System.out.printf("O valor de e %c %f.%n", 233, e);
	}
	private static int Fatorial(int n) {
		int fatorial = 1;
		for (int i = 2; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}
