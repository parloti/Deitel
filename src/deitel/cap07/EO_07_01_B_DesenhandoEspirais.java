package deitel.cap07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class EO_07_01_B_DesenhandoEspirais extends JPanel {
	private static final long serialVersionUID = 1L;
	private static final int sensesSemiPeriod = 1;
	private static final int atomicSize = 30;
	private static final int startAngle = 0;
	private static final int arcAngle = 180;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		
		int rectangleXStart;
		int rectangleYStart;
		int rectangleWidth;
		int rectangleHeigth;
		int sense;
		
		g.setColor(Color.BLUE);
		
		for (int i = 1; i < 15; i++) {
			sense = checkSense(i - 1);
			rectangleXStart = centerX - atomicSize * (i / 2);
			rectangleYStart = centerY - atomicSize * (i - 1) / 2;
			rectangleWidth = atomicSize * i;
			rectangleHeigth = rectangleWidth;
			
			g.drawArc(rectangleXStart, rectangleYStart, rectangleWidth, rectangleHeigth, startAngle, sense * arcAngle);
		}
	}
	
	private int checkSense(int i) {
		int semiPeriodsComplete;
		boolean isPar;
		
		semiPeriodsComplete = i / sensesSemiPeriod;
		isPar = checkIfIsPar(semiPeriodsComplete);
		
		if (isPar) {
			return 1;
		} else {
			return -1;
		}
	}
	
	private boolean checkIfIsPar(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
