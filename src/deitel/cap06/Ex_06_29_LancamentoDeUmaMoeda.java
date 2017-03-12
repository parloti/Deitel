package deitel.cap06;

import java.util.Random;
import java.util.Scanner;

public class Ex_06_29_LancamentoDeUmaMoeda {

	enum Coin {
		HEADS, TAILS
	}

	static int headsCount = 0;
	static int tailsCount = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Escolha uma opção.");
			System.out.println("1 para Toss Cain.");
			System.out.println("2 para Sair.");
			opcao = input.nextInt();
			if (opcao == 1) {
				System.out.println(flip());
			}
		} while (opcao != 2);
		input.close();

		System.out.printf("O numero de HEADS é %d, e de TAILS é %d.%n", headsCount, tailsCount);
	}

	private static Coin flip() {
		Random randomNumbers = new Random();
		int result = 1 + randomNumbers.nextInt(2);
		if (result == 1) {
			headsCount++;
			return Coin.HEADS;
		} else {
			tailsCount++;
			return Coin.TAILS;
		}
	}

}
