package deitel.cap04;

import java.util.Scanner;

public class Ex_04_21_C_LocalizeOMaiorNumero {

	public static void main(String[] args) {
		int counter=0, number=0, largest=0;
		Scanner input = new Scanner(System.in);
		for (;counter<10;counter++) {
			System.out.println("Insira o próximo inteiro.");
			number = input.nextInt();
			if (number > largest) {
				largest=number;
			}
		}
		input.close();
		System.out.printf("O maior inteiro e: %d.%n", largest);
	}

}
