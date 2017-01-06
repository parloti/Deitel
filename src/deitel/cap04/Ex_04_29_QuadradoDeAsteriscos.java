/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel.cap04;

import java.util.Scanner;

public class Ex_04_29_QuadradoDeAsteriscos {

	public static void main(String[] args) {
		System.out.println("Informa o tamanho do lado do quadrado (entre 1 a 20).");
		Scanner teclado = new Scanner(System.in);
		int lado = teclado.nextInt();
		for (int i = 0; i < lado; i++) {
			System.out.print("*");
		}
		System.out.printf("%n");
		for (int i = 0; i < lado - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < lado - 2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.printf("%n");
		}
		if (lado > 1) {
			for (int i = 0; i < lado; i++) {
				System.out.print("*");
			}
		}
	}
}
