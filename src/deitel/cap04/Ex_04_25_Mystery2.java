package deitel.cap04;

public class Ex_04_25_Mystery2 {

	public static void main(String[] args) {
		int count = 1;
		while (count <= 10) {
			System.out.println(count % 2 == 1 ? "****" : "++++++++");
			++count;
		}
	}
}
