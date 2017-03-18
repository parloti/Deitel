package deitel.cap07;

public class Ex_07_10_ComissoesDeVendas {
	
	public static void main(String[] args) {
		int[] contadorDeGanhos = new int[11];
		System.out.printf("%s%15s%n", "Vendas", "Ganhos");
		for (int i = 2; i < contadorDeGanhos.length - 1; i++) {
			int ganhoMin = 200 + i * 9;
			int ganhoMax = 200 + (i + 1) * 9;
			System.out.printf("$%d00 - %d99: %8d - %d%n", i, i, ganhoMin, ganhoMax);
		}
		System.out.printf("$%d00: %13d%n", 10, 290);
	}
	
}
