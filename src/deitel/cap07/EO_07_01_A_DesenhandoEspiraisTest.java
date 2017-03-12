package deitel.cap07;

import javax.swing.JFrame;

public class EO_07_01_A_DesenhandoEspiraisTest {
	
	public static void main(String[] args) {
		EO_07_01_A_DesenhandoEspirais panel = new EO_07_01_A_DesenhandoEspirais();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 400);
		application.setVisible(true);
	}
	
}
