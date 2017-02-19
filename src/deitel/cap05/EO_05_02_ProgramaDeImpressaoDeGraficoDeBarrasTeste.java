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

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class EO_05_02_ProgramaDeImpressaoDeGraficoDeBarrasTeste extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		String input;
		int numero1, numero2, numero3, numero4, numero5;
		input = JOptionPane.showInputDialog("Insira o primeiro inteiro.");
		numero1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Insira o segundo inteiro.");
		numero2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Insira o terceiro inteiro.");
		numero3 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Insira o quarto inteiro.");
		numero4 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Insira o quinto inteiro.");
		numero5 = Integer.parseInt(input);

		EO_05_02_ProgramaDeImpressaoDeGraficoDeBarras panel;
		panel = new EO_05_02_ProgramaDeImpressaoDeGraficoDeBarras(numero1, numero2, numero3, numero4, numero5);

		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}
