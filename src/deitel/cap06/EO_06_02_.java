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
public class EO_06_02_ extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Random randomNumbers = new Random();
		for (int i = 1; i <= 10; i++) {
			int red = randomNumbers.nextInt(256);
			int green = randomNumbers.nextInt(256);
			int blue = randomNumbers.nextInt(256);

			int formType = randomNumbers.nextInt(2);

			int width = 1 + randomNumbers.nextInt(300 / 2);
			int height = 1 + randomNumbers.nextInt(300 / 2);

			int x = randomNumbers.nextInt(300 - width);
			int y = randomNumbers.nextInt(300 - height);

			Color color = new Color(red, green, blue);

			if (formType == 0) {
				g.fillOval(x, y, width, height);
			} else {
				g.fillRect(x, y, width, height);
			}
			g.setColor(color);
		}
	}
}