package deitel.cap02;

import java.util.Scanner;

public class Ex_02_24_MaioresEMenoresInteiros {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int inteiro1, inteiro2, inteiro3, inteiro4, inteiro5;
		System.out.print("Insira o primeiro inteiro: ");
		inteiro1 = input.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		inteiro2 = input.nextInt();
		System.out.print("Insira o terceiro inteiro: ");
		inteiro3 = input.nextInt();
		System.out.print("Insira o quarto inteiro: ");
		inteiro4 = input.nextInt();
		System.out.print("Insira o quinto inteiro: ");
		inteiro5 = input.nextInt();

		if (inteiro1 > inteiro2) {
			if (inteiro1 > inteiro3) {
				if (inteiro1 > inteiro4) {
					if (inteiro1 > inteiro5) {
						System.out.printf("%d é o maior número%n", inteiro1);
					}
				}
			}
		}
		if (inteiro2 > inteiro1) {
			if (inteiro2 > inteiro3) {
				if (inteiro2 > inteiro4) {
					if (inteiro2 > inteiro5) {
						System.out.printf("%d é o maior número%n", inteiro2);
					}
				}
			}
		}
		if (inteiro3 > inteiro1) {
			if (inteiro3 > inteiro2) {
				if (inteiro3 > inteiro4) {
					if (inteiro3 > inteiro5) {
						System.out.printf("%d é o maior número%n", inteiro3);
					}
				}
			}
		}
		if (inteiro4 > inteiro1) {
			if (inteiro4 > inteiro2) {
				if (inteiro4 > inteiro3) {
					if (inteiro4 > inteiro5) {
						System.out.printf("%d é o maior número%n", inteiro4);
					}
				}
			}
		}
		if (inteiro5 > inteiro1) {
			if (inteiro5 > inteiro2) {
				if (inteiro5 > inteiro3) {
					if (inteiro5 > inteiro4) {
						System.out.printf("%d é o maior número%n", inteiro5);
					}
				}
			}
		}

		if (inteiro1 < inteiro2) {
			if (inteiro1 < inteiro3) {
				if (inteiro1 < inteiro4) {
					if (inteiro1 < inteiro5) {
						System.out.printf("%d é o menor número%n", inteiro1);
					}
				}
			}
		}
		if (inteiro2 < inteiro1) {
			if (inteiro2 < inteiro3) {
				if (inteiro2 < inteiro4) {
					if (inteiro2 < inteiro5) {
						System.out.printf("%d é o menor número%n", inteiro2);
					}
				}
			}
		}
		if (inteiro3 < inteiro1) {
			if (inteiro3 < inteiro2) {
				if (inteiro3 < inteiro4) {
					if (inteiro3 < inteiro5) {
						System.out.printf("%d é o menor número%n", inteiro3);
					}
				}
			}
		}
		if (inteiro4 < inteiro1) {
			if (inteiro4 < inteiro2) {
				if (inteiro4 < inteiro3) {
					if (inteiro4 < inteiro5) {
						System.out.printf("%d é o menor número%n", inteiro4);
					}
				}
			}
		}
		if (inteiro5 < inteiro1) {
			if (inteiro5 < inteiro2) {
				if (inteiro5 < inteiro3) {
					if (inteiro5 < inteiro4) {
						System.out.printf("%d é o menor número%n", inteiro5);
					}
				}
			}
		}
	}
}
