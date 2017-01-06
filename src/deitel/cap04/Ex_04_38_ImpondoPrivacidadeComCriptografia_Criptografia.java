//4.38
package deitel.cap04;

import java.util.Scanner;

public class Ex_04_38_ImpondoPrivacidadeComCriptografia_Criptografia {

	public static void main(String args[]) {
		//ler inteiro de 4 digitos
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe o inteiro de quatro digitos a ser criptografado.");
		int inteiro = keyboard.nextInt();
		int digito, adicao,resto;
		int criptografado=0;
		int valorDoDigito=0;
		for (int contador=4;contador>0;contador--){
			digito = inteiro % 10;
			adicao = digito + 7;
			resto=adicao % 10;
			switch(contador){
				case 1:
					valorDoDigito=(int) Math.pow(10, 2-1);
					break;
				case 2:
					valorDoDigito=(int) Math.pow(10, 1-1);
					break;
				case 3:
					valorDoDigito=(int) Math.pow(10, 4-1);
					break;
				case 4:
					valorDoDigito=(int) Math.pow(10, 3-1);
					break;
			}
			criptografado += valorDoDigito* resto;
			inteiro = inteiro / 10;
		}
		System.out.printf("O inteiro criptografado é: %d.%n",criptografado);
	}
}
