package deitel.cap04;

import java.util.Scanner;

public class Ex_04_24_ValidandoEntradaDeUsuario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;
		while (studentCounter <= 10) {
			System.out.print("Enter result (1 pass, 2 = fail): ");
			result = input.nextInt();

			if (result == 1) {
				passes = passes + 1;
			} else if (result == 2) {
				failures = failures + 1;
			} else {
				System.out.printf("%s is invalid value.%n", result);
				studentCounter--;
			}

			studentCounter = studentCounter + 1;
		}
		input.close();
		System.out.printf("Passed: %d\nFailed: %d%n", passes, failures);
		if (passes > 8) {
			System.out.println("Bonus to instructor !");
		}
	}
}
