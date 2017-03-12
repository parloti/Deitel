package deitel.cap06;

public class Ex_06_25_NumerosPrimos {

	public static void main(String[] args) {
		System.out.print("Primos: ");
		boolean isprimo;
		for (int i = 2; i < 10000; i++) {
			isprimo=isPrimo(i);
			if (isprimo) {
				System.out.print(i+", ");
			}
		}
		System.out.println("");
		System.out.print("Primos: ");
		for (int i = 2; i < 10000; i++) {
			isprimo=isPrimo2(i);
			if (isprimo) {
				System.out.print(i+", ");
			}
		}
	}
	
	private static boolean isPrimo(int number){
		boolean isdivisor;
		for(int i=2;i<=number/2;i++){
			isdivisor=isDivisor(i,number);
			if(isdivisor){
				return false;
			}
		}
		return true;
	}
	private static boolean isPrimo2(int number){
		boolean isdivisor;
		for(int i=2;i<=Math.sqrt(number);i++){
			isdivisor=isDivisor(i,number);
			if(isdivisor){
				return false;
			}
		}
		return true;
	}
	private static boolean isDivisor(int i, int number){
		return number%i==0;
	}

}
