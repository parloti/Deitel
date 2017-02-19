package deitel.cap04;

import java.util.Scanner;

public class Ex_04_18_C_CalculadorDeLimiteDeCredito {

	public static void main(String[] args) {
		int numeroConta = 0, saldoInicial = 0, debitos = 0, creditos = 0, saldoFinal = 0, limite = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o numero da conta.");
		numeroConta = input.nextInt();
		System.out.println("Insira o saldo inicial.");
		saldoInicial = input.nextInt();
		System.out.println("Insira o total de debitos.");
		debitos = input.nextInt();
		System.out.println("Insira o total de creditos.");
		creditos = input.nextInt();
		System.out.println("Insira o limite de credito.");
		limite = input.nextInt();
		input.close();
		saldoFinal = saldoInicial - debitos + creditos;
		if (saldoFinal < limite) {
			System.out.println("Limite de credito excedido para a conta "+numeroConta);
		}
	}

}
