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
public class Ex_05_31_FairTax {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double despesasTotal=0;

		System.out.print("Informe o valor das despesas com moradia: ");
		despesasTotal += input.nextInt();
		
		System.out.print("Informe o valor das despesas com alimentação: ");
		despesasTotal += input.nextInt();
		
		System.out.print("Informe o valor das despesas com vestuário: ");
		despesasTotal += input.nextInt();
		
		System.out.print("Informe o valor das despesas com transporte: ");
		despesasTotal += input.nextInt();
		
		System.out.print("Informe o valor das despesas com educação: ");
		despesasTotal += input.nextInt();
		
		System.out.print("Informe o valor das despesas com assistência médica: ");
		despesasTotal += input.nextInt();
		
		System.out.print("Informe o valor das despesas com férias: ");
		despesasTotal += input.nextInt();
		
		System.out.printf("A FairTax estimada que pagaria é : %,.2f",despesasTotal*23/77);
	}
}
