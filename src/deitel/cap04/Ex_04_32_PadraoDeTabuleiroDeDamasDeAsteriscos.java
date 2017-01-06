package deitel.cap04;

public class Ex_04_32_PadraoDeTabuleiroDeDamasDeAsteriscos {

	public static void main(String args[]) {
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 8; i++) {
				System.out.print("* ");
			}
			System.out.println();
			if (j % 2 == 0) {
				System.out.print(" ");
			}
		}
	}
}
