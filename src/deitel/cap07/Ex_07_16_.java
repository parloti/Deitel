package deitel.cap07;

public class Ex_07_16_ {
	
	public static void main(String[] args) {
		
		if (args.length > 0) {
			double sum = 0;
			for (String s : args) {
				sum += Double.parseDouble(s);
			}
			System.out.printf("Sum is: %.2f%n", sum);
		} else {
			System.out.println("args is empty");
		}
	}
	
}
