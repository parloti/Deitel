package deitel.cap07;

public class Ex_07_12_EliminacaoDeDuplicatas {
	private static int[] arr = new int[5];
	public static int numbersInserted = 0;
	
	public static void insert(int next) {
		boolean currentNumberWasInserted = false;
		
		for (int i = 0; i < arr.length; i++) {
			currentNumberWasInserted = false;
			if (arr[i] == next) {
				currentNumberWasInserted = true;
				break;
			}
		}
		if (!currentNumberWasInserted) {
			arr[numbersInserted] = next;
			numbersInserted++;
			printInserted();
		}
	}
	
	private static void printInserted() {
		System.out.print("Numero unicos ja inseridos: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 10) {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("");
	}
}
