package deitel.cap06;

public class Ex_06_34_TabelaDeNumerosBinariosOctalEHexadecimal {

	public static void main(String[] args) {
		System.out.printf("%s %20s %20s %20s%n", "Decimal", "Hexadecimal", "Octal", "Binária");
		for (int i = 1; i <= 256; i++) {
			System.out.printf("%d %20s %20s %20s%n", i, DecToBase(i, 16), DecToBase(i, 8), DecToBase(i, 2));
		}
	}

	private static String DecToBase(int dec, int base) {
		int valorPosicional = 1;
		int fatorPosicional = 1;
		String newBase = "";
		while (valorPosicional <= dec / base) {
			valorPosicional *= base;
			fatorPosicional++;
		}
		for (int j = 0; j < fatorPosicional; j++) {
			int quotient = dec / valorPosicional;
			int rest = dec % valorPosicional;
			valorPosicional /= base;
			dec = rest;
			newBase += hexaSymbol(quotient);

		}
		return newBase;
	}

	private static String hexaSymbol(int number) {
		switch (number) {
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";
		default:
			return number + "";
		}
	}
}
