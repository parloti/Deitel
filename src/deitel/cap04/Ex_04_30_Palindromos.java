/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel.cap04;

import java.util.Scanner;

public class Ex_04_30_Palindromos {

	public static void main(String[] args) {
		String inteiro;
		System.out.println("Informe um inteiro de cinco digitos.");
		Scanner teclado = new Scanner(System.in);
		inteiro = teclado.next();
		while (inteiro.length() != 5) {
			System.out.println("O numero informado não tem cinco digitos.");
			System.out.println("Informe um inteiro de cinco digitos.");
			inteiro = teclado.next();
		}
		if (inteiro.charAt(0) == inteiro.charAt(4)
				&& inteiro.charAt(1) == inteiro.charAt(3)) {
			System.out.printf("%s é um palindromo.%n", inteiro);
		}
		else {
			System.out.printf("%s não é um palindromo.%n", inteiro);
		}
	}
}
