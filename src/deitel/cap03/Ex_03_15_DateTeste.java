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
public class Ex_03_15_DateTeste {

	public static void main(String args[]) {
		Ex_03_15_Date date = new Ex_03_15_Date(11, 9, 1984);
		date.displayDate();
		date.setDia(30);
		date.setMes(11);
		date.setAno(1111);
		System.out.printf("%d/%d/%d%n", date.getMes(), date.getDia(), date.getAno());
	}
}
