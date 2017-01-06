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
public class Ex_02_35_CalculadoraDeEconomiaDaFaixaSolidaria {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int milhasTotais, precoGalao, rendimentoGalao, estacionamento, pedagio, despesasComCombustivel;
		System.out.print("Insira as milhas totais dirigidas por dia: ");
		milhasTotais = input.nextInt();
		System.out.print("Insira o preço por galão de gasolina: ");
		precoGalao = input.nextInt();
		System.out.print("Insira as milhas médias por galão: ");
		rendimentoGalao = input.nextInt();
		System.out.print("Insira as taxas de estacionamento por dia: ");
		estacionamento = input.nextInt();
		System.out.print("Insira o pedágio por dia: ");
		pedagio = input.nextInt();
		despesasComCombustivel = precoGalao * milhasTotais / rendimentoGalao;

		System.out.println();
		System.out.printf("Custo por dia de dirigir para o trabalho: %d%n", pedagio + estacionamento + despesasComCombustivel);
	}
}
