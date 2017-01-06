package deitel.cap04;

public class Ex_04_22_SaidaNoFormatoDeTabela {

	public static void main(String[] args) {
		System.out.println("N\t10*N\t100*N\t1000*N");
		for(int i=1;i<6;i++){
			System.out.printf("%d\t%d\t%d\t%d%n",i,i*10,i*100,i*1000);
		}
	}

}
