package deitel.cap04;

import javax.swing.JFrame;

public class EO_04_02_A_DrawPanelTest {

	public static void main(String[] args) {
		EO_04_02_A_DrawPanel panel = new EO_04_02_A_DrawPanel();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
	}
}
