package deitel.cap04;

import java.util.Scanner;

public class Ex_04_19_C_CalculadorDeComissaoDeVendas {

	public static void main(String[] args) {
		double[] item = {239.99, 129.75, 99.95, 350.89};
		double comissao = 0, rendimento = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < item.length; i++) {
			System.out.print("Insira a quantidade vendida do item: ");
			comissao += input.nextDouble() * item[i] * 0.09;
		}
		input.close();
		rendimento = comissao + 200;
		System.out.printf("O redimento do vendedor e: %f.%n", rendimento);
	}

}
