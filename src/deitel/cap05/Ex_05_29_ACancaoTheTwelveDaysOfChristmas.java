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
public class Ex_05_29_ACancaoTheTwelveDaysOfChristmas {

	public static void main(String args[]) {
		for (int verso = 1; verso <= 3; verso++) {
			System.out.print("On the ");
			switch (verso) {
				case 1:
					System.out.print("First");
					break;
				case 2:
					System.out.print("Second");
					break;
				case 3:
					System.out.print("Third");
					break;
			}
			System.out.println(" day of Christmas my true love sent to me");
			switch (verso) {
				case 3:
					System.out.print("Three French Hens,\n");
				case 2:
					System.out.print("Two Turtle Doves\nand ");
				case 1:
					System.out.print("a Partridge in a Pear Tree.\n");
					break;

			}
			System.out.println();
		}
	}
}
