package deitel.cap03;

import java.util.Scanner;

public class Ex_03_16_HeartRatesTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome:");
		String nome = input.next();
		System.out.println("Digite o sobrenome:");
		String sobrenome = input.next();
		System.out.println("Digite o dia de nascimento:");
		int dia = input.nextInt();
		System.out.println("Digite o mes de nascimento:");
		int mes = input.nextInt();
		System.out.println("Digite o ano de nascimento:");
		int ano = input.nextInt();
		Ex_03_16_HeartRates heartRates
				= new Ex_03_16_HeartRates(nome, sobrenome, new Ex_03_15_Date(dia, mes, ano));
		System.out.printf("%s %s ", heartRates.getNome(), heartRates.getSobrenome());
		System.out.printf("nascido em ");
		heartRates.dateOfBirth.displayDate();
		System.out.printf("Sua idade é: %d%n", heartRates.getAge());
		System.out.printf("Sua frequencia cardiaca maxima é: %d%n", heartRates.frequenciaCardiacaMaxima());
		System.out.printf("Sua frequencia cardiaca alvo é: %s%n", heartRates.frequenciaCardiacaAlvo());
	}
}
