//4.38
package deitel.cap04;

import java.util.Scanner;

public class Ex_04_38_ImpondoPrivacidadeComCriptografia_Decriptografia {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe o inteiro de quatro digitos a ser decriptografado.");
		int inteiro = keyboard.nextInt();
		int digito, subtracao, completo;
		int decriptografado = 0;
		int valorDoDigito = 0;
		for (int contador = 4; contador > 0; contador--) {
			digito = inteiro % 10;
			subtracao = digito - 7;
			completo = subtracao;
			while (completo < 0) {
				completo += 10;
			}
			switch (contador) {
				case 1:
					valorDoDigito = (int) Math.pow(10, 2 - 1);
					break;
				case 2:
					valorDoDigito = (int) Math.pow(10, 1 - 1);
					break;
				case 3:
					valorDoDigito = (int) Math.pow(10, 4 - 1);
					break;
				case 4:
					valorDoDigito = (int) Math.pow(10, 3 - 1);
					break;
			}
			decriptografado += valorDoDigito * completo;
			inteiro = inteiro / 10;
		}
		System.out.printf("O inteiro decriptografado é: %d.%n", decriptografado);
	}
}
