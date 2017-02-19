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

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class EO_06_01_ extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int spaceBetweenDiscs = 25;
		Random randomNumbers = new Random();
		int r1 = randomNumbers.nextInt(256);
		int g1 = randomNumbers.nextInt(256);
		int b1 = randomNumbers.nextInt(256);
		int r2 = randomNumbers.nextInt(256);
		int g2 = randomNumbers.nextInt(256);
		int b2 = randomNumbers.nextInt(256);

		for (int i = 1; i <= 5; i++) {

			if (i % 2 != 0) {
				Color color1 = new Color(r1, g1, b1);
				g.setColor(color1);
			} else {
				Color color2 = new Color(r2, g2, b2);
				g.setColor(color2);
			}
			g.fillOval(spaceBetweenDiscs * i, spaceBetweenDiscs * i, 280 - 2 * spaceBetweenDiscs * i, 280 - 2 * spaceBetweenDiscs * i);

		}
	}
}
