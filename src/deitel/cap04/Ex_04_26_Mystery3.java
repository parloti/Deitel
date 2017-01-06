package deitel.cap04;

public class Ex_04_26_Mystery3 {

	public static void main(String[] args) {
		int row = 10;
		int column;
		while (row >= 1) {
			column = 1;
			while (column <= 10) {
				System.out.print(row % 2 == 1 ? "<" : ">");
				++column;
			}
			--row;
			System.out.println();
		}
	}
}
