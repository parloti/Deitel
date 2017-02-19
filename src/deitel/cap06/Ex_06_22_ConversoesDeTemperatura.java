package deitel.cap06;

import java.util.Scanner;

public class Ex_06_22_ConversoesDeTemperatura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a temperatura a ser convertida: ");
		int temp = input.nextInt();
		char unidade = ' ';
		while (unidade != 'C' && unidade != 'F') {
			System.out.print("Informe a unidade temperatura a ser convertida(C ou F): ");
			unidade=input.next().charAt(0);
		}
		input.close();
		if(unidade=='C'){
			System.out.printf("A temperatura equivalente em fahrenheit é: %d.%n",fahrenheit(temp));;
		}
		else if(unidade=='F'){
			System.out.printf("A temperatura equivalente em celsius é: %d.%n",celsius(temp));
		}
		else{
			System.out.printf("Unidade '%c' inválida.%n",unidade);
		}
	}

	private static int celsius(int fahrenheit) {
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		return (int) celsius;
	}

	private static int fahrenheit(int celsius) {
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return (int) fahrenheit;
	}

}
