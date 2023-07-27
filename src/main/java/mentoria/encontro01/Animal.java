package mentoria.encontro01;

public class Animal {

	private String nome;
	private String raca;
	private float peso;
	private String cor;

	public Animal() {
		super();
	}

	public Animal(String nome, String raca, float peso, String cor) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
