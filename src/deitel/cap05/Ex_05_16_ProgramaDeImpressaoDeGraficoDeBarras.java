/*
 * Copyright (C) 2017 Alex
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package deitel.cap05;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ex_05_16_ProgramaDeImpressaoDeGraficoDeBarras {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int numero, numero1, numero2, numero3, numero4, numero5;

		System.out.println("Insira o primeiro inteiro.");
		numero1 = input.nextInt();
		System.out.println("Insira o segundo inteiro.");
		numero2 = input.nextInt();
		System.out.println("Insira o terceiro inteiro.");
		numero3 = input.nextInt();
		System.out.println("Insira o quarto inteiro.");
		numero4 = input.nextInt();
		System.out.println("Insira o quinto inteiro.");
		numero5 = input.nextInt();
		input.close();
		
		for (int i = 1; i <= 5; i++) {
			switch (i) {
				case 1:
					numero = numero1;
					break;
				case 2:
					numero = numero2;
					break;
				case 3:
					numero = numero3;
					break;
				case 4:
					numero = numero4;
					break;
				default:
					numero = numero5;
					break;
			}
			if (numero < 1) {
				numero = 1;
			} else if (numero > 30) {
				numero = 30;
			}
			int j = 0;
			do {
				System.out.print("*");
				j++;
			} while (j < numero);
			System.out.println();
		}
	}
}
