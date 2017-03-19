package deitel.cap07;

public class Ex_07_15_InitArray {
	
	public static void main(String[] args) {
		int[] array;
		int ARRAY_SIZE;
		
		if (args.length > 0) {
			ARRAY_SIZE = Integer.parseInt(args[0]);
		} else {
			ARRAY_SIZE = 10;
		}
		
		array = new int[ARRAY_SIZE];
		System.out.printf("%s%8s %n", "Index", "Value");
		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}
	
}
