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
public class Ex_03_14_EmployeeTest {

	public static void main(String[] args) {
		Ex_03_14_Employee employee1 = new Ex_03_14_Employee("Alex", "Parloti", 1500.50);
		Ex_03_14_Employee employee2 = new Ex_03_14_Employee("Meida", "Estevam", 1000.50);
		System.out.println("Dados dos funcionários: ");
		System.out.printf("Nome: %s %s.%nSalário: %2f.%n", employee1.getNome(), employee1.getSobrenome(), employee1.getSalario());
		System.out.printf("Nome: %s %s.%nSalário: %2f.%n", employee2.getNome(), employee2.getSobrenome(), employee2.getSalario());
	}
}
