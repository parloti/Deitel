package deitel.cap04;

public class Ex_04_39_CrescimentoDemograficoMundial {

	public static void main(String args[]) {
		double taxaDeCrescimento = 1.012;
		int pupulacaoAtual = 0;
		int aumento = 0;
		int populacaoAnterior = 6070581;
		int anoDeDuplicacao=0;
		String tab = "\t";
		System.out.println("Ano\tPopulacao\tAumento");
		for (int i = 1; i < 76; i++) {
			pupulacaoAtual = (int) (populacaoAnterior * taxaDeCrescimento);
			aumento = pupulacaoAtual - populacaoAnterior;
			if(pupulacaoAtual<2*6070581){
				anoDeDuplicacao=i+1;
			}
			if (pupulacaoAtual > 9999999) {
				tab = "";
			}
			System.out.printf("%d\t%d\t%s%d%n", i, pupulacaoAtual, tab, aumento);
			populacaoAnterior = pupulacaoAtual;
		}
		System.out.printf("A população dobrara no ano %d.%n", anoDeDuplicacao);
	}
}
