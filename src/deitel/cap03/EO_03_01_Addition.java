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

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class EO_03_01_Addition {

	public static void main(String args[]) {
		int number1;
		int number2;
		int sum;
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer: "));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer: "));
		sum = number1 + number2;
		JOptionPane.showMessageDialog(null, String.format("Sum is %d\n", sum));
	}
}
