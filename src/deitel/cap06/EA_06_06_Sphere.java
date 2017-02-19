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

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class EA_06_06_Sphere {

	public void determineSphereVolume() {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o raio da esfera: ");
		double radius = input.nextDouble();
		input.close();
		
		System.out.printf("O volume da esfera é %,.2f.%n", sphereVolume(radius));
	}

	private double sphereVolume(double radius) {
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
}
