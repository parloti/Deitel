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
package deitel.cap05;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class EO_05_01_Shapes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 1; i < 13; i++) {
			g.drawOval(140 - i * 20 / 2, 150 - i * 20 / 2, 20 * i, 20 * i);
		}
	}
}
