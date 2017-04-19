package deitel.cap07;

public class Ex_07_21_GraficosDeTartaruga {
	
	public int[][] floor = new int[12][12];
	public int avanco;
	public int caneta = 0;
	
	public enum Sentido {
		ESQUERDA, DIREITA
	}
	
	int[][] Sentidos = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	
	int[] posicao = { 0, 0 };
	int sentidoIndex = 0;
	
	public boolean move(int[] comando) {
		int action = comando[0];
		switch (action) {
			case 1:
				caneta = 0;
				break;
			case 2:
				caneta = 1;
				break;
			case 3:
				sentidoIndex++;
				while (sentidoIndex < 0) {
					sentidoIndex = sentidoIndex + 4;
				}
				sentidoIndex %= 4;
				break;
			case 4:
				sentidoIndex--;
				while (sentidoIndex < 0) {
					sentidoIndex = sentidoIndex + 4;
				}
				sentidoIndex %= 4;
			case 5:
				int linha = posicao[0];
				int coluna = posicao[1];
				int linhaSentido = Sentidos[sentidoIndex][0];
				int colunaSentido = Sentidos[sentidoIndex][1];
				for (int i = 0; i < comando[1]; i++) {
					if (linhaSentido == 1) {
						linha = posicao[0] + i;
					} else if (linhaSentido == -1) {
						linha = posicao[0] - i;
					}
					if (colunaSentido == 1) {
						coluna = posicao[1] + i;
					} else if (colunaSentido == -1) {
						coluna = posicao[1] - i;
					}
					linha = Math.min(linha, floor.length - 1);
					coluna = Math.min(coluna, floor[linha].length - 1);
					floor[linha][coluna] = caneta;
				}
				posicao[0] = linha;
				posicao[1] = coluna;
				break;
			case 6:
				
				return false;
			case 9:
				return false;
		}
		return true;
	}
	
	public void print() {
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < floor[i].length; j++) {
				if (floor[i][j] == 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println("");
		}
	}
}
