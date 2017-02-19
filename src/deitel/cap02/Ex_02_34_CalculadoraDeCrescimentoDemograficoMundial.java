/*
 * Copyright (C) 2016 Alex
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
package deitel.cap02;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ex_02_34_CalculadoraDeCrescimentoDemograficoMundial {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int populacao, taxa;
		System.out.print("Insira a População Mundial Atual: ");
		populacao = input.nextInt();
		System.out.print("Insira a Taxa De Crescimento Demográfica Mundial Anual (%): ");
		taxa = input.nextInt();
		input.close();
		System.out.println();
		System.out.printf("População Mundial em Um Ano: %d.%n",
				populacao * (taxa + 100) / 100
		);
		System.out.printf("População Mundial em Dois Anos: %d.%n",
				populacao * (taxa + 100) / 100 * (taxa + 100) / 100
		);
		System.out.printf("População Mundial em Tres Anos: %d.%n",
				populacao * (taxa + 100) / 100 * (taxa + 100) / 100 * (taxa + 100) / 100
		);
		System.out.printf("População Mundial em Quatro Anos: %d.%n",
				populacao * (taxa + 100) / 100 * (taxa + 100) / 100 * (taxa + 100) / 100 * (taxa + 100) / 100
		);
		System.out.printf("População Mundial em Cinco Anos: %d.%n",
				populacao * (taxa + 100) / 100 * (taxa + 100) / 100 * (taxa + 100) / 100 * (taxa + 100) / 100 * (taxa + 100) / 100
		);
	}
}
