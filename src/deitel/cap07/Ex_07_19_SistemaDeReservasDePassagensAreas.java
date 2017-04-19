package deitel.cap07;

import java.util.Scanner;

public class Ex_07_19_SistemaDeReservasDePassagensAreas {
	
	static final Scanner input = new Scanner(System.in);
	
	static boolean[] assentosOcupados = new boolean[11];
	
	public static void main(String[] args) {
		int assentosDisponiveis;
		do {
			assentosDisponiveis = 0;
			for (int i = 1; i <= 10; i++) {
				if (assentosOcupados[i] != true) {
					assentosDisponiveis++;
				}
			}
			if (assentosDisponiveis > 0) {
				Menu();
			}
		} while (assentosDisponiveis > 0);
		System.out.println("Nenhuma poltrona disponivel.");
		System.out.println("O próximo voo parte em 3 horas.");
	}
	
	public static void Menu() {
		int category = 0;
		do {
			System.out.println("Digite 1 para First Class");
			System.out.println("Digite 2 para Economy");
			category = input.nextInt();
		} while (category != 1 && category != 2);
		reservarAssento(category);
	}
	
	public static void reservarAssento(int category) {
		int first;
		int last;
		if (category == 1) {
			first = 1;
			last = 5;
		} else {
			first = 6;
			last = 10;
		}
		for (int i = first; i <= last; i++) {
			if (assentosOcupados[i] != true) {
				assentosOcupados[i] = true;
				cartaoEmbarque(category, i);
				return;
			}
		}
		mudarCategory(category);
	}
	
	public static void cartaoEmbarque(int category, int assento) {
		String _classe;
		if (category == 1) {
			_classe = "First Class";
		} else {
			_classe = "Economy Class";
		}
		System.out.printf("%nCartão de embarque.%n");
		System.out.printf("%s.%n", _classe);
		System.out.printf("Poltrona: %02d.%n%n", assento);
	}
	
	public static void mudarCategory(int category) {
		int first;
		int last;
		String ask;
		if (category == 2) {
			first = 1;
			last = 5;
			category = 1;
			ask = "Categoria Economy lotada! \n" + "Aceita First Class? (s/n)";
		} else {
			first = 6;
			last = 10;
			category = 2;
			ask = "Categoria First Class lotada! \n" + "Aceita Economy? (s/n)";
		}
		for (int i = first; i <= last; i++) {
			if (assentosOcupados[i] != true) {
				System.out.printf("%s%n", ask);
				if (input.next().charAt(0) == 's') {
					reservarAssento(category);
				} else {
					System.out.printf("O próximo voo parte em 3 horas.%n%n");
				}
				return;
			}
		}
		System.out.println("Nenhuma poltrona disponivel.");
		System.out.println("O próximo voo parte em 3 horas.");
	}
}
