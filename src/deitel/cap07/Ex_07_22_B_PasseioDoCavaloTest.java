package deitel.cap07;

public class Ex_07_22_B_PasseioDoCavaloTest {
	
	public static void main(String[] args) {
		int[] vertical = { -1, -2, -2, -1, 1, 2, 2, 1 };
		int[] horizontal = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int currentRow = 3;
		int currentColumn = 4;
		int moves = 0;
		int housesVisited = 0;
		int[][] houses = new int[8][8];
		
		houses[currentRow][currentColumn] = moves + 1;
		while (moves < 64) {
			moves++;
			for (int moveNumber = 0; moveNumber < horizontal.length; moveNumber++) {
				boolean exceedsLeftBorder = currentColumn + horizontal[moveNumber] < 0;
				boolean exceedsRightBorder = currentColumn + horizontal[moveNumber] > 7;
				boolean exceedsTopBorder = currentRow + vertical[moveNumber] < 0;
				boolean exceedsBottomBorder = currentRow + vertical[moveNumber] > 7;
				if (exceedsLeftBorder || exceedsRightBorder || exceedsTopBorder || exceedsBottomBorder) {
					continue;
				} else {
					boolean houseAlreadUsed = houses[currentRow + vertical[moveNumber]][currentColumn
							+ horizontal[moveNumber]] != 0;
					if (houseAlreadUsed) {
						continue;
					} else {
						currentRow += vertical[moveNumber];
						currentColumn += horizontal[moveNumber];
						houses[currentRow][currentColumn] = moves + 1;
						housesVisited++;
						break;
					}
				}
			}
		}
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				System.out.printf("%02d ", houses[col][row]);
			}
			System.out.println("");
		}
		System.out.printf("%02d", housesVisited);
	}
	
}
