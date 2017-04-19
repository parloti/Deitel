package deitel.cap07;

public class Ex_07_21_GraficosDeTartarugaTest {
	
	// private static Random randomNubers = new Random();
	
	public static void main(String[] args) {
		Ex_07_21_GraficosDeTartaruga graph = new Ex_07_21_GraficosDeTartaruga();
		int[][] comandos = { { 2 }, { 5, 12 }, { 3 }, { 5, 12 }, { 3 }, { 5, 12 }, { 3 }, { 5, 12 }, { 1 }, { 6 } };
		for (int i = 0; i < comandos.length; i++) {
			graph.move(comandos[i]);
		}
		graph.print();
	}
	
}
