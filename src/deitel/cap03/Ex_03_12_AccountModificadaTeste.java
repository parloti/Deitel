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

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ex_03_12_AccountModificadaTeste {
	
	public static void main(String[] args) {
		Ex_03_12_AccountModificada account1 = new Ex_03_12_AccountModificada(50.00);
		Ex_03_12_AccountModificada account2 = new Ex_03_12_AccountModificada(-7.53);
		Scanner input = new Scanner(System.in);
		double depositAmount;
		double debitAmount;
		
		//Exibe saldos
		System.out.printf("account1 balance: $%.2f %n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f %n%n", account2.getBalance());
		
		
		//Deposito account1
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
		account1.credit(depositAmount);
		
		//Exibe saldos
		System.out.printf("account1 balance: $%.2f %n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f %n%n", account2.getBalance());
		
		//Deposito account2
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
		account2.credit(depositAmount);
		
		//Exibe saldos
		System.out.printf("account1 balance: $%.2f %n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f %n%n", account2.getBalance());
		
		//Debito account1
		System.out.print("Enter debit amount for account1: ");
		debitAmount = input.nextDouble();
		System.out.printf("%nDebiting %.2f to account1 balance%n%n", debitAmount);
		account1.debit(debitAmount);
		
		//Exibe saldos
		System.out.printf("account1 balance: $%.2f %n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f %n%n", account2.getBalance());
		
		//Debito account2
		System.out.print("Enter debit amount for account2: ");
		debitAmount = input.nextDouble();
		System.out.printf("%nAdding %.2f to account2 balance%n%n", debitAmount);
		account2.debit(debitAmount);
		
		//Exibe saldos
		System.out.printf("account1 balance: $%.2f %n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f %n", account2.getBalance());
		
		input.close();
	}
}
