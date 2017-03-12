package deitel.cap07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class EO_07_01_A_DesenhandoEspirais extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static final int lineSensesSemiPeriod = 2;
	private static final int linesAtomicSize = 30;
	private static final int lineIncrementsPeriod = 2;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		
		int lineXStart;
		int lineYStart;
		int lineXEnd;
		int lineYEnd;
		int senseX;
		int senseY;
		
		g.setColor(Color.RED);
		
		lineXStart = centerX;
		lineYStart = centerY;
		
		for (int lineIndex = 1; lineIndex <= 13; lineIndex++) {
			senseX = checkSense(lineIndex);
			senseY = checkSense(lineIndex + 1);
			
			lineXEnd = centerX + senseX * calculatesLinesSize(lineIndex);
			lineYEnd = centerY - senseY * calculatesLinesSize(lineIndex + 1);
			
			g.drawLine(lineXStart, lineYStart, lineXEnd, lineYEnd);
			
			lineXStart = lineXEnd;
			lineYStart = lineYEnd;
		}
	}
	
	private int checkSense(int lineIndex) {
		int semiPeriodsComplete;
		boolean isPar;
		
		semiPeriodsComplete = lineIndex / lineSensesSemiPeriod;
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
	
	private int calculatesLinesSize(int lineIndex) {
		int periodsComplete;
		int linesSize;
		
		periodsComplete = lineIndex / lineIncrementsPeriod;
		linesSize = linesAtomicSize * periodsComplete;
		
		return linesSize;
	}
}
