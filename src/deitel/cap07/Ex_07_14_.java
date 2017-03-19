package deitel.cap07;

import java.util.Random;

public class Ex_07_14_ {
	
	private static Random randomNumbers = new Random();
	
	public static void main(String[] args) {
		int arg1 = argument();
		int arg2 = argument();
		int arg3 = argument();
		int arg4 = argument();
		int arg5 = argument();
		
		System.out.printf("arg1 = %d%narg2 = %d%narg3 = %d%narg4 = %d%narg5 = %d%n", arg1, arg2, arg3, arg4, arg5);
		
		System.out.println("");
		System.out.printf("arg1 is %d.%n", product(arg1));
		
		System.out.printf("Product between arg1, arg2 and arg3 is %d.%n", product(arg1, arg2, arg3));
		
		System.out.printf("Product between arg1, arg2, arg3, arg4 and arg5 is %d.%n",
				product(arg1, arg2, arg3, arg4, arg5));
	}
	
	public static int argument() {
		return 1 + randomNumbers.nextInt(10);
	}
	
	public static int product(int... numbers) {
		int prod = 1;
		for (int number : numbers) {
			prod *= number;
		}
		return prod;
	}
	
}
