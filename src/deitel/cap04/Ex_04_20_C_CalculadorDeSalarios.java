package deitel.cap04;

import java.util.Scanner;

public class Ex_04_20_C_CalculadorDeSalarios {

	public static void main(String[] args) {
		double horasTrabalhadas = 0, salarioHora = 0, salarioBruto = 0;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Insira as horas trabalhadas, ou -1 para encerrar.");
			horasTrabalhadas = input.nextInt();
			if (horasTrabalhadas != -1) {
				System.out.println("Insira o salario-hora.");
				salarioHora = input.nextInt();
				if (horasTrabalhadas > 40) {
					salarioBruto = salarioHora * (horasTrabalhadas * 1.5 - 20);
				} else {
					salarioBruto = salarioHora * horasTrabalhadas;
				}
				System.out.printf("Salario bruto do funcionario: %f.%n", salarioBruto);
			} else {
				break;

			}
		}
		input.close();
	}

}
