package deitel.cap03;

public class Ex_03_17_HealthProfile {

	String nome;
	String sobrenome;
	char sexo;
	int altura;
	int peso;
	Ex_03_15_Date dateOfBirth;
	Ex_03_16_HeartRates heartRates;

	public Ex_03_17_HealthProfile(String nome, String sobrenome, char sexo, int altura, int peso, Ex_03_15_Date dateOfBirth) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.dateOfBirth = dateOfBirth;
		this.heartRates = new Ex_03_16_HeartRates(nome, sobrenome, dateOfBirth);
	}

	public int getIMC() {
		return 703 * this.peso / this.altura / this.altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPeso() {
		return this.peso;
	}
}
