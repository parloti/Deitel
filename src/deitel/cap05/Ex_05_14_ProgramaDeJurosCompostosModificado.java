package deitel.cap05;

public class Ex_05_14_ProgramaDeJurosCompostosModificado {

	public static void main(String args[]) {
		double amount;
		double principal = 1000.0;

		for (double rate = 5; rate <= 10; rate++) {
			System.out.printf("%s%20.0f%s%n", "Tax:", rate, "%");
			System.out.printf("%s%20s%n", "Year", "Amount on deposit");

			for (int year = 1; year <= 10; year++) {
				amount = principal * Math.pow(1.0 + rate / 100, year);

				System.out.printf("%4d%,20.2f%n", year, amount);
			}
			System.out.println();
		}
	}
}
