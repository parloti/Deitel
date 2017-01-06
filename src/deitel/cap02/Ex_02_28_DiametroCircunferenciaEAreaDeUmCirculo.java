package deitel.cap02;

import java.util.Scanner;

public class Ex_02_28_DiametroCircunferenciaEAreaDeUmCirculo {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int raio;
		System.out.print("Insira o raio do círculo: ");
		raio = input.nextInt();
		System.out.printf("O diâmetro do círculo %d.%n", 2 * raio);
		System.out.printf("A circunferência do círculo %f.%n", 2 * Math.PI * raio);
		System.out.printf("A área do círculo %f.%n", Math.PI * raio * raio);
	}
}
