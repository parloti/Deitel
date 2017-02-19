/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel.cap04;

import java.util.Scanner;

public class Ex_04_31_ImprimindoOEquivalenteDecimalDeUmNumeroBinario {

	public static void main(String args[]) {
		Scanner input;
		input = new Scanner(System.in);

		int binarioInicial, binario, decimal, contador, resto;

		System.out.printf("Insira um n%cmero bin%crio inteiro.%n", 250, 225);
		binarioInicial = input.nextInt();
		input.close();
		
		binario = binarioInicial;
		decimal = 0;
		contador = 0;

		do {
			resto = binario % 2;
			decimal += resto * Math.pow(2, contador);
			binario = binario / 10;
			contador++;
		} while (binario > 0);

		System.out.printf("O equivalente decimal de %d %c %d.%n", binarioInicial, 233, decimal);
	}
}
