package deitel.cap04;

import java.util.Scanner;

public class Ex_04_23_EncontreOsDoisNumerosMaiores {

	public static void main(String[] args) {
		int counter = 0, number = 0, largest = 0, secondLargest = 0;
		Scanner input = new Scanner(System.in);
		for (; counter < 5; counter++) {
			System.out.println("Insira o proximo inteiro.");
			number = input.nextInt();
			if (number > largest) {
				secondLargest = largest;
				largest = number;
			} else if (number > secondLargest) {
				secondLargest = number;
			}
		}
		input.close();
		System.out.printf("Os dois maiores numeros sao %d e %d.%n", largest, secondLargest);
	}

}
