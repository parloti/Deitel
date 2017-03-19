package deitel.cap07;

import java.util.Random;

public class Ex_07_17_JogoDeDados {
	private static Random randomNumbers = new Random();
	
	public static void main(String[] args) {
		int launch1;
		int launch2;
		int sum;
		int[] occurrences;
		int repetitions;
		double[] prob;
		
		prob = probability();
		
		occurrences = new int[13];
		repetitions = 36000;
		
		for (int i = 0; i < repetitions; i++) {
			launch1 = launch();
			launch2 = launch();
			sum = launch1 + launch2;
			occurrences[sum]++;
		}
		System.out.printf("%45s%n", "Occurrences");
		System.out.printf("%s%20s%20s%20s%n", "Sum", "Registered", "Expected", "Exceeded");
		
		for (int i = 2; i < occurrences.length; i++) {
			int expected = (int) (repetitions * prob[i]);
			int exceeded = occurrences[i] - expected;
			System.out.printf("%02d%20d%20d%20d%n", i, occurrences[i], expected, exceeded);
		}
	}
	
	private static int launch() {
		return 1 + randomNumbers.nextInt(6);
	}
	
	private static double[] probability() {
		double[] prob;
		
		prob = new double[13];
		
		prob[2] = 1.0 / 36;
		prob[3] = 2.0 / 36;
		prob[4] = 3.0 / 36;
		prob[5] = 4.0 / 36;
		prob[6] = 5.0 / 36;
		prob[7] = 6.0 / 36;
		prob[8] = 5.0 / 36;
		prob[9] = 4.0 / 36;
		prob[10] = 3.0 / 36;
		prob[11] = 2.0 / 36;
		prob[12] = 1.0 / 36;
		
		return prob;
	}
}
