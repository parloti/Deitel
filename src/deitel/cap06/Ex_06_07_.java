package deitel.cap06;

public class Ex_06_07_ {

	public static void main(String[] args) {
		System.out.printf("Math.abs(7.5) = %f%n", Math.abs(7.5));
		System.out.printf("Math.floor(7.5) = %f%n", Math.floor(7.5));
		System.out.printf("Math.abs(0.0) = %f%n", Math.abs(0.0));
		System.out.printf("Math.ceil(0.0) = %f%n", Math.ceil(0.0));
		System.out.printf("Math.abs(-6.4) = %f%n", Math.abs(-6.4));
		System.out.printf("Math.ceil(-6.4) = %f%n", Math.ceil(-6.4));
		System.out.printf("Math.ceil(-Math.abs(-8+Math.floor(-5.5))) = %f%n",
				Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));
	}

}
