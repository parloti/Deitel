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
package deitel.cap06;

import static java.lang.Math.*;

/**
 *
 * @author Alex
 */
public class EA_06_03_MathTest {

	public static void main(String args[]) {
		System.out.printf("abs(23.7) é 23.7: %b%n", abs(23.7) == 23.7);
		System.out.printf("abs(0.0) é 0.0: %b%n", abs(0.0) == 0.0);
		System.out.printf("abs(-23.7) é 23.7: %b%n%n", abs(-23.7) == 23.7);

		System.out.printf("ceil(9.2) é 10.0: %b%n", ceil(9.2) == 10.0);
		System.out.printf("ceil(-9.8) é -9.0: %b%n%n", ceil(-9.8) == -9.0);

		System.out.printf("cos(0.0) é 1.0: %b%n%n", cos(0.0) == 1.0);

		System.out.printf("exp(1.0) é 2.71828: %b%n", exp(1.0) == 2.71828);
		System.out.printf("exp(2.0) é 7.38906: %b%n%n", exp(2.0) == 7.38906);

		System.out.printf("floor(9.2) é 9.0: %b%n", floor(9.2) == 9.0);
		System.out.printf("floor(-9.8) é -10.0: %b%n%n", floor(-9.8) == -10.0);

		System.out.printf("log(E) é 1.0: %b%n", log(E) == 1.0);
		System.out.printf("log(E*E) é 2.0: %b%n%n", log(E * E) == 2.0);

		System.out.printf("max(2.3,12.7) é 12.7: %b%n", max(2.3, 12.7) == 12.7);
		System.out.printf("max(-2.3,-12.7) é -2.3: %b%n%n", max(-2.3, -12.7) == -2.3);

		System.out.printf("min(2.3,12.7) é 2.3: %b%n", min(2.3, 12.7) == 2.3);
		System.out.printf("min(-2.3,-12.7) é -12.7: %b%n%n", min(-2.3, -12.7) == -12.7);

		System.out.printf("pow(2.0,7.0) é 128.0: %b%n", pow(2.0, 7.0) == 128.0);
		System.out.printf("pow(9.0,0.5) é 3.0: %b%n%n", pow(9.0, 0.5) == 3.0);

		System.out.printf("sin(0.0) é 0.0: %b%n%n", sin(0.0) == 0.0);

		System.out.printf("sqrt(900.0) é 30.0: %b%n%n", sqrt(900.0) == 30.0);

		System.out.printf("tan(0.0) é 0.0: %b%n", tan(0.0) == 0.0);
	}
}
