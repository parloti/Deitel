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
public class Ex_05_25_ProgramaDeImpressaoDeLosangosModificado {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int numeroDeLinhas;
		System.out.println("Informe o número de linhas do losango.");
		numeroDeLinhas = input.nextInt();
		for (int l = 0; l < numeroDeLinhas; l++) {
			for (int c = 0; c < numeroDeLinhas; c++) {
				if (l >= numeroDeLinhas / 2 - c
						&& l >= c - numeroDeLinhas / 2
						&& l <= c + numeroDeLinhas / 2
						&& l <= numeroDeLinhas - 1 + numeroDeLinhas / 2 - c) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
