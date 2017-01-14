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

/**
 *
 * @author Alex
 */
public class Ex_05_21_TriplosDePitagoras {

	public static void main(String args[]) {
		System.out.printf("%s%20s%20s%n", "Hypotenuse", "Side1", "Side2");
		for (int i = 1; i <= 500; i++) {
			for (int j = 1; j <= 500; j++) {
				for (int k = j; k <= 500; k++) {
					if (i * i == j * j + k * k) {
						System.out.printf("%d%20d%20d%n", i, j, k);
					}
				}
			}
		}
	}
}
