package deitel.cap03;

import java.util.Scanner;

public class Ex_03_17_HealthProfileTest {

	public static void main(String[] args) {
		Scanner input;
		String nome;
		String sobrenome;
		char sexo;
		int dia;
		int mes;
		int ano;
		int peso;
		int altura;

		input = new Scanner(System.in);
		System.out.println("Digite o nome:");
		nome = input.next();
		System.out.println("Digite o sobrenome:");
		sobrenome = input.next();
		System.out.println("Digite o sexo:");
		sexo = input.next().charAt(0);
		System.out.println("Digite o dia de nascimento:");
		dia = input.nextInt();
		System.out.println("Digite o mes de nascimento:");
		mes = input.nextInt();
		System.out.println("Digite o ano de nascimento:");
		ano = input.nextInt();
		System.out.println("Digite o peso:");
		peso = input.nextInt();
		System.out.println("Digite a altura:");
		altura = input.nextInt();
		input.close();
		
		Ex_03_17_HealthProfile healthProfile = new Ex_03_17_HealthProfile(nome, sobrenome, sexo,altura,peso,new Ex_03_15_Date(dia, mes, ano));
		
		System.out.printf("%s %s ", healthProfile.getNome(), healthProfile.getSobrenome());
		System.out.printf("nascido em ");
		healthProfile.dateOfBirth.displayDate();
		System.out.printf("Sua idade é: %d%n", healthProfile.heartRates.getAge());
		System.out.printf("Sua frequencia cardiaca maxima é: %d%n", healthProfile.heartRates.frequenciaCardiacaMaxima());
		System.out.printf("Sua frequencia cardiaca alvo é: %s%n", healthProfile.heartRates.frequenciaCardiacaAlvo());
		System.out.printf("Seu IMC é: %d%n", healthProfile.getIMC());
		System.out.println("BMI Values");
		System.out.println("Underweight:\t less than 18.5");
		System.out.println("Normal:\t between 18.5 and 24.9");
		System.out.println("Overweight:\t between 25 and 29.9");
		System.out.println("Obese:\t 30 or greater");
	}

}
