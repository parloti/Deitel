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
public class Ex_05_11_LocalizeOMenorValor {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int menorInt=0;
		int inteiro;

		System.out.println("Quantos inteiro serão inseridos?");
		int numeroDeInt = input.nextInt();
		input.close();
		
		for (int count = 0; count < numeroDeInt; count++) {
			System.out.println("Insira o próximo inteiro.");
			inteiro = input.nextInt();
			if (count == 0) {
				menorInt = inteiro;
			}
			if (inteiro < menorInt) {
				menorInt = inteiro;
			}
		}
		System.out.printf("O menor inteiro inserido foi %d.%n",menorInt);
	}
}
