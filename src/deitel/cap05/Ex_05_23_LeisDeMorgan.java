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
public class Ex_05_23_LeisDeMorgan {

	public static void main(String args[]) {
		boolean testResult = true, exp1, exp2;
		System.out.println("a) Teste das expressões \"!( x < 5 ) && !( y >= 7)\" e \"!( x < 5 || y >= 7)\"");
		for (int x = 4; x <= 5; x++) {
			for (int y = 6; y <= 7; y++) {
				exp1 = !(x < 5) && !(y >= 7);
				exp2 = !(x < 5 || y >= 7);
				System.out.printf("Se x = %d e y = %d%n", x, y);
				System.out.printf("!( x < 5 ) && !( y >= 7) = %b%n", exp1);
				System.out.printf("!( x < 5 || y >= 7) = %b%n", exp2);
				System.out.println();
				if (exp1 != exp2) {
					testResult = false;
				}
			}
		}
		if (testResult) {
			System.out.println("As expressões produzem o mesmo valor.");
		} else {
			System.out.println("As expressões NÃO produzem o mesmo valor.");
		}
		System.out.printf("%n%n");

		System.out.println("b) Teste das expressões \"!(a == b) || !(g != 5)\" e \"!(a == b && g != 5)\"");
		testResult = true;
		for (int a = -1; a <= 1; a++) {
			for (int b = -1; b <= 1; b++) {
				for (int g = 4; g <= 6; g++) {
					exp1 = !(a == b) || !(g != 5);
					exp2 = !(a == b && g != 5);
					System.out.printf("Se a = %d, b = %d e g = %d%n", a, b, g);
					System.out.printf("!(a == b) || !(g != 5) = %b%n", exp1);
					System.out.printf("!(a == b && g != 5) = %b%n", exp2);
					System.out.println();
					if (exp1 != exp2) {
						testResult = false;
					}
				}
			}
		}
		if (testResult) {
			System.out.println("As expressões produzem o mesmo valor.");
		} else {
			System.out.println("As expressões NÃO produzem o mesmo valor.");
		}
		System.out.printf("%n%n");

		testResult = true;
		System.out.println("c) Teste das expressões \"!((x <= 8) && (y > 4))\" e \"!(x <= 8) || !(y > 4)\"");
		for (int x = 7; x <= 9; x++) {
			for (int y = 4; y <= 5; y++) {
				exp1 = !((x <= 8) && (y > 4));
				exp2 = !(x <= 8) || !(y > 4);
				System.out.printf("Se x = %d e y = %d%n", x, y);
				System.out.printf("!( x < 5 ) && !( y >= 7) = %b%n", exp1);
				System.out.printf("!( x < 5 || y >= 7) = %b%n", exp2);
				System.out.println();
				if (exp1 != exp2) {
					testResult = false;
				}
			}
		}
		if (testResult) {
			System.out.println("As expressões produzem o mesmo valor.");
		} else {
			System.out.println("As expressões NÃO produzem o mesmo valor.");
		}
		System.out.printf("%n%n");

		testResult = true;
		System.out.println("d) Teste das expressões \"!((i > 4) || (j <= 6))\" e \"!(i > 4) && !(j <= 6)\"");
		for (int i = 4; i <= 5; i++) {
			for (int j = 5; j <= 7; j++) {
				exp1 = !((i > 4) || (j <= 6));
				exp2 = !(i > 4) && !(j <= 6);
				System.out.printf("Se x = %d e y = %d%n", i, j);
				System.out.printf("!( x < 5 ) && !( y >= 7) = %b%n", exp1);
				System.out.printf("!( x < 5 || y >= 7) = %b%n", exp2);
				System.out.println();
				if (exp1 != exp2) {
					testResult = false;
				}
			}
		}
		if (testResult) {
			System.out.println("As expressões produzem o mesmo valor.");
		} else {
			System.out.println("As expressões NÃO produzem o mesmo valor.");
		}
		System.out.printf("%n%n");
	}
}
