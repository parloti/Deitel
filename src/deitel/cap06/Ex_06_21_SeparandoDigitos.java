package deitel.cap06;

import java.util.Random;

public class Ex_06_21_SeparandoDigitos {

	public static void main(String[] args) {
		Random randomNumbers = new Random();
		int inteiro = 1 + randomNumbers.nextInt(99999);
		System.out.println(inteiro);
		displayDigits(inteiro);
	}

	public static int parteInteiro(int a, int b) {
		return (int) (a / b);
	}

	public static int restoInteiro(int a, int b) {
		return a % b;
	}

	private static void displayDigits(int inteiro) {
		String str="";
		while(inteiro>1){
			str=restoInteiro(inteiro, 100)+" "+str;
			inteiro=parteInteiro(inteiro, 100);
		}
		System.out.println(str);
	}

}
