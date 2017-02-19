package deitel.cap04;

import java.awt.Graphics;
import javax.swing.JPanel;

public class EO_04_02_B_DrawPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int i = 0;
		while (++i < 16) {
			g.drawLine(0, 0, (15 - i) * width / 15, i * height / 15);
			g.drawLine(width, 0, i * width / 15, i * height / 15);
			g.drawLine(width, height, (15 - i) * width / 15, i * height / 15);
			g.drawLine(0, height, i * width / 15, i * height / 15);
		}
	}
}
