package deitel.cap07;

public class Ex_07_22_C_PasseioDoCavaloTest {
	
	public static void main(String[] args) {
		int passeiosCompletos = 0;
		for (int iniRow = 0; iniRow < 7; iniRow++) {
			for (int iniCol = 0; iniCol < 7; iniCol++) {
				Ex_07_22_C_PasseioDoCavalo passeio = new Ex_07_22_C_PasseioDoCavalo();
				passeio.currentRow = iniRow;
				passeio.currentCol = iniCol;
				int attempts = 0;
				
				passeio.houses[passeio.currentRow][passeio.currentCol] = 1;
				while (attempts < 64) {
					attempts++;
					passeio.calculateAccessibility();
					// horse.printAccessibility();
					passeio.calculateBestMove();
					passeio.move();
				}
				System.out.println("Ordem de visita das casas.");
				for (int row = 0; row < 8; row++) {
					for (int col = 0; col < 8; col++) {
						System.out.printf("%02d ", passeio.houses[row][col]);
					}
					System.out.println("");
				}
				System.out.printf("Casas visitadas: %d%n%n", passeio.housesVisited);
				if (passeio.housesVisited == 64) {
					passeiosCompletos++;
				}
			}
		}
		System.out.printf("Passeios completos: %d", passeiosCompletos);
	}
}
