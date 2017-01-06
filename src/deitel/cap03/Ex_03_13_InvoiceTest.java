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
package deitel.cap03;

/**
 *
 * @author Alex
 */
public class Ex_03_13_InvoiceTest {
	//String numero, String descricao,int quantidade,double preco

	public static void main(String[] args) {
		Ex_03_13_Invoice invoice = new Ex_03_13_Invoice("1", "Mouse", 5, 10.5);
		System.out.printf("Dados da fatura: %nNúmero: %s.%nDescrição: %s.%nQuantidade: %d.%nPreço: %2f.%n", invoice.getNumero(), invoice.getDescricao(), invoice.getQuantidade(), invoice.getPreco());

	}
}
