package deitel.cap04;

import java.util.Scanner;

public class Ex_04_17_C_QuilometragemDeCombustivel {

	public static void main(String[] args) {
		int kmTotal = 0, litrosTotal = 0, km = 0, litros = 0;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Insira a quilometragem percorrida, ou -1, para encerrar.");
			km = input.nextInt();
			if (km != -1) {
				System.out.println("Insira a quantidade de litros consumida.");
				litros = input.nextInt();
				System.out.printf("Redimento desse tanque: %d.%n", km / litros);
				kmTotal += km;
				litrosTotal += litros;
			} else {
				break;
			}
		}
		input.close();
		System.out.printf("Redimento medio dos tanque: %d.%n", kmTotal / litrosTotal);
	}

}
