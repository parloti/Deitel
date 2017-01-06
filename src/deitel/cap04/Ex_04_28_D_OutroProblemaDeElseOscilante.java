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
package deitel.cap04;

/**
 *
 * @author Alex
 */
public class Ex_04_28_D_OutroProblemaDeElseOscilante {

	public static void main(String args[]) {
		int x = 5, y = 7;
		if (y == 8) {
			if (x == 5) {
				System.out.println("@@@@@");
			}
		} else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
	}
}
