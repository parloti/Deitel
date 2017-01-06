package deitel.cap02;

import java.util.Scanner;

public class Ex_02_33_CalculadoraDeIndiceDeMassaCorporal {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int peso, altura, imc;
		System.out.print("Insira o seu peso em Kilogramas: ");
		peso = input.nextInt();
		System.out.print("Insira a sua altura em centimetros: ");
		altura = input.nextInt();
		imc = 100 * 100 * peso / altura / altura;
		
		System.out.println();
		System.out.printf("Seu IMC e %d:%n", imc);
		System.out.println("BMI Values");
		System.out.println("Underweight:\t less than 18.5");
		System.out.println("Normal:\t between 18.5 and 24.9");
		System.out.println("Overweight:\t between 25 and 29.9");
		System.out.println("Obese:\t 30 or greater");
	}
}
