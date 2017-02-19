package deitel.cap06;

public class Ex_06_15_CalculosDaHipotenusa {

	public static void main(String[] args) {
		System.out.printf("Tringulo 1, Lado 1: 3.0, Lado 2: 4.0, Hipotenusa: %,.2f.%n", hypotenuse(3.0, 4.0));
		System.out.printf("Tringulo 2, Lado 1: 5.0, Lado 2: 12.0, Hipotenusa: %,.2f.%n", hypotenuse(5.0, 12.0));
		System.out.printf("Tringulo 3, Lado 1: 8.0, Lado 2: 15.0, Hipotenusa: %,.2f.%n", hypotenuse(8.0, 15.0));
	}

	public static double hypotenuse(double side1, double side2) {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}

}
