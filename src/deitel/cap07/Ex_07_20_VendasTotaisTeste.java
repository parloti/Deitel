package deitel.cap07;

import java.util.Random;

public class Ex_07_20_VendasTotaisTeste {
	
	private static Random randomNubers = new Random();
	
	public static void main(String[] args) {
		int equipes = Ex_07_20_VendasTotais.EQUIPES;
		int produtos = Ex_07_20_VendasTotais.PRODUTOS;
		int[][] sales = Ex_07_20_VendasTotais.sales;
		int valorVendido;
		for (int i = 1; i <= equipes; i++) {
			for (int j = 1; j <= produtos; j++) {
				valorVendido = randomNubers.nextInt(1000);
				sales[i][j] = valorVendido;
			}
		}
		Ex_07_20_VendasTotais.relatorio();
	}
	
}
