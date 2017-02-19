package deitel.cap02;

import java.util.Scanner;

public class Ex_02_15_Aritmetica {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int number1, number2, sum, product, difference, quotient;
		System.out.print("Insert the first number: ");
		number1 = input.nextInt();
		System.out.print("Insert the second number: ");
		number2 = input.nextInt();
		input.close();
		sum = number1 + number2;
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
		System.out.printf("The sum is %d.%n", sum);
		System.out.printf("The product is %d.%n", product);
		System.out.printf("The difference is %d.%n", difference);
		System.out.printf("The quotient is %d.%n", quotient);
	}
}
