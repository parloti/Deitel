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
public class EO_05_02_ProgramaDeImpressaoDeGraficoDeBarras extends JPanel {

	private int numero;
	private final int numero1;
	private final int numero2;
	private final int numero3;
	private final int numero4;
	private final int numero5;
	private final int rectWidth = 30;

	public EO_05_02_ProgramaDeImpressaoDeGraficoDeBarras(int numero1, int numero2, int numero3, int numero4, int numero5) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		this.numero4 = numero4;
		this.numero5 = numero5;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 1; i <= 5; i++) {
			switch (i) {
				case 1:
					numero = numero1;
					break;
				case 2:
					numero = numero2;
					break;
				case 3:
					numero = numero3;
					break;
				case 4:
					numero = numero4;
					break;
				default:
					numero = numero5;
					break;
			}
			if (numero < 1) {
				numero = 1;
			} else if (numero > 30) {
				numero = 30;
			}
			int j = 0;
			do {
				g.drawRect(50, i * rectWidth, 5*numero, rectWidth);
				j++;
			} while (j < numero);
		}
	}
}
