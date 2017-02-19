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
public class Ex_05_17_CalculandoVendas {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int produto, quantidade;
		double valor, valorTotal;
		valorTotal = 0.0;
		do {
			System.out.printf("Insira o número do produto.%nOu '-1' para encerrar.%n");
			produto = input.nextInt();
			if (produto == -1) {
				break;
			}
			if (produto >= 1 && produto <= 5) {
				System.out.printf("%nInsira a quantidade vendida do produto %d.%n", produto);
				quantidade = input.nextInt();
				input.close();
				
				switch (produto) {
					case 1:
						valor = 2.98;
						break;
					case 2:
						valor = 4.5;
						break;
					case 3:
						valor = 9.98;
						break;
					case 4:
						valor = 4.49;
						break;
					case 5:
						valor = 6.87;
						break;
					default:
						System.out.printf("Produto (%d) invalido, insira um valor de 1 a 5.%nOu '-1' para encerrar.%n%n", produto);
						valor = 0;
						break;
				}
				valorTotal += quantidade * valor;
			} else {
				System.out.printf("Produto (%d) invalido, insira um valor de 1 a 5.%nOu '-1' para encerrar.%n%n", produto);
			}
		} while (produto != -1);
		System.out.printf("A valor total dos produtos vendidos é US$%.2f.%n", valorTotal);
	}
}
