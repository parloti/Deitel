package deitel.cap07;

import java.util.Random;

public class Ex_07_12_EliminacaoDeDuplicatasTest {
	
	private static Random randomNumbers = new Random();
	
	public static void main(String[] args) {
		
		do {
			int next = 10 + randomNumbers.nextInt(91);
			Ex_07_12_EliminacaoDeDuplicatas.insert(next);
		} while (Ex_07_12_EliminacaoDeDuplicatas.numbersInserted < 5);
	}
	
}
