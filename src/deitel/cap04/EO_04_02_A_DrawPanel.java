package deitel.cap04;

import java.awt.Graphics;
import javax.swing.JPanel;

public class EO_04_02_A_DrawPanel extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int i = 0;
		while (++i < 16) {
			g.drawLine(0, 0, (15 - i) * width / 15, i * height / 15);
		}
	}
}
