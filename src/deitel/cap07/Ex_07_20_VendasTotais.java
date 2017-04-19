package deitel.cap07;

public class Ex_07_20_VendasTotais {
	public static final int EQUIPES = 4;
	public static final int PRODUTOS = 5;
	public static int[][] sales = new int[EQUIPES + 1][PRODUTOS + 1];
	
	public static void relatorio() {
		System.out.printf("%s%40s%n", "", "Vendedores");
		System.out.printf("%s%6d%15d%15d%15d%n", "Produtos", 1, 2, 3, 4);
		for (int i = 1; i <= PRODUTOS; i++) {
			System.out.print(i);
			for (int j = 1; j <= EQUIPES; j++) {
				System.out.printf("%15d", sales[j][i]);
			}
			System.out.println("");
		}
	}
}
