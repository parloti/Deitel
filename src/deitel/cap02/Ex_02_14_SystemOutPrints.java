//Esse aplicativo exibe os números 1 a 4 na mesma linha, com cada par de números 
//adjacentes separados por um espaço utilizando diferentes instruções de impressão.
package deitel.cap02;

public class Ex_02_14_SystemOutPrints {

	public static void main(String args[]) {
		System.out.println("Instrução System.out.println:");
		System.out.println("12 34");

		System.out.println("Instrução System.out.print:");
		System.out.print("1");
		System.out.print("2 ");
		System.out.print("3");
		System.out.print("4");
		System.out.println();

		System.out.println("Instrução System.out.printf:");
		System.out.printf("12 34%n");
	}
}
