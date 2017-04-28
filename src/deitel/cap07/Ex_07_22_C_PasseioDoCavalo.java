package deitel.cap07;

public class Ex_07_22_C_PasseioDoCavalo {
	int[] vertical = { -1, -2, -2, -1, 1, 2, 2, 1 };
	int[] horizontal = { 2, 1, -1, -2, -2, -1, 1, 2 };
	int currentRow = 0;
	int currentCol = 0;
	int moves = 0;
	int housesVisited = 1;
	int[][] houses = new int[8][8];
	int[][] accessibility;
	int[] bestTarget = new int[2];
	
	public void calculateAccessibility() {
		accessibility = new int[8][8];
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				for (int moveNumber = 0; moveNumber < horizontal.length; moveNumber++) {
					int targetRow = row + vertical[moveNumber];
					int targetCol = col + horizontal[moveNumber];
					
					boolean exceedsTopBorder = targetRow < 0;
					boolean exceedsBottomBorder = targetRow > 7;
					boolean exceedsLeftBorder = targetCol < 0;
					boolean exceedsRightBorder = targetCol > 7;
					
					if (exceedsTopBorder || exceedsBottomBorder || exceedsLeftBorder || exceedsRightBorder) {
						continue;
					} else {
						boolean houseAlreadUsed = houses[targetRow][targetCol] != 0;
						if (houseAlreadUsed) {
							continue;
						} else {
							accessibility[row][col]++;
						}
					}
				}
			}
		}
	}
	
	public void printAccessibility() {
		for (int col = 0; col < 8; col++) {
			for (int row = 0; row < 8; row++) {
				System.out.printf("%02d ", accessibility[col][row]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
	}
	
	public void calculateBestMove() {
		int targetRow;
		int targetCol;
		bestTarget[0] = -1;
		bestTarget[1] = -1;
		int smallerAccessibility = 8;
		int goodTargetsCount = 0;
		for (int moveNumber = 0; moveNumber < horizontal.length; moveNumber++) {
			targetRow = currentRow + vertical[moveNumber];
			targetCol = currentCol + horizontal[moveNumber];
			
			boolean exceedsTopBorder = targetRow < 0;
			boolean exceedsBottomBorder = targetRow > 7;
			boolean exceedsLeftBorder = targetCol < 0;
			boolean exceedsRightBorder = targetCol > 7;
			if (exceedsLeftBorder || exceedsRightBorder || exceedsTopBorder || exceedsBottomBorder) {
				continue;
			} else {
				boolean houseAlreadUsed = houses[targetRow][targetCol] != 0;
				if (houseAlreadUsed) {
					continue;
				} else if (smallerAccessibility >= accessibility[targetRow][targetCol]) {
					bestTarget[0] = targetRow;
					bestTarget[1] = targetCol;
					smallerAccessibility = accessibility[targetRow][targetCol];
				}
			}
		}
	}
	
	public void calculateSmallerAccessibility() {
		int targetRow;
		int targetCol;
		int smallerAccessibility = 8;
		for (int moveNumber = 0; moveNumber < horizontal.length; moveNumber++) {
			targetRow = currentRow + vertical[moveNumber];
			targetCol = currentCol + horizontal[moveNumber];
			
			boolean exceedsTopBorder = targetRow < 0;
			boolean exceedsBottomBorder = targetRow > 7;
			boolean exceedsLeftBorder = targetCol < 0;
			boolean exceedsRightBorder = targetCol > 7;
			if (exceedsLeftBorder || exceedsRightBorder || exceedsTopBorder || exceedsBottomBorder) {
				continue;
			} else {
				boolean houseAlreadUsed = houses[targetRow][targetCol] != 0;
				if (houseAlreadUsed) {
					continue;
				} else if (smallerAccessibility >= accessibility[targetRow][targetCol]) {
					bestTarget[0] = targetRow;
					bestTarget[1] = targetCol;
					smallerAccessibility = accessibility[targetRow][targetCol];
				}
			}
		}
	}
	
	public void move() {
		if (bestTarget[0] != -1) {
			moves++;
			currentRow = bestTarget[0];
			currentCol = bestTarget[1];
			houses[currentRow][currentCol] = moves + 1;
			housesVisited++;
		}
	}
}
