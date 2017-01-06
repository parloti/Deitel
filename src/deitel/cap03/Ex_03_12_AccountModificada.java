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
public class Ex_03_12_AccountModificada {

	private double balance;

	public Ex_03_12_AccountModificada(double initialBalance) {
		if (initialBalance > 0.0) {
			balance = initialBalance;
		}
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public double getBalance() {
		return balance;
	}

	public void debit(double amount) {
		if (amount > balance) {
			System.out.printf("Debit amount exceeded account balance.%n%n");
			return;
		}
		balance = balance - amount;
	}
}
