package deitel.cap06;

public class Ex_06_24_NumerosPerfeitos {

	public static void main(String[] args) {
		for (int i = 1; i < 100000; i++) {
			if (isPerfect(i)) {
				System.out.println("Perfeito: "+i);
			}
		}
	}

	private static boolean isPerfect(int number) {
		int i = number / 2;
		int factorsSum = 0;
		while (i > 0) {
			if (number % i == 0) {
				factorsSum += i;
			}
			i--;
		}
		return number == factorsSum;
	}

}
