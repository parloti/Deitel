package deitel.cap06;

import java.util.Scanner;

public class Ex_06_08_TaxaDeEstacionamento {

	double total = 0;

	public void Charges() {
		Scanner input = new Scanner(System.in);
		double horas = 0.0;
		while (horas != -1.0) {
			System.out.print("Informe a quantidade de horas estacionadas (ou '-1'para encerrar): ");
			horas = input.nextDouble();
			System.out.printf("A taxa para o cliente atual é %,.2f%n", calculateCharges(horas));
			System.out.printf("A saldo do dia é %,.2f%n%n", total);
		}
		input.close();
		System.out.println("Programa encerrado.");
	}

	public double calculateCharges(double horas) {
		double charge = 2.0;
		if (horas > 3) {
			charge += (Math.ceil(horas) - 3) * 0.5;
		}
		if (charge > 10.0) {
			charge = 10.0;
		}
		total += charge;
		return charge;
	}
}
