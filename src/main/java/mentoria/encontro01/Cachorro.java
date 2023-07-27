package mentoria.encontro01;

public class Cachorro extends Animal {

	private String tipoAnimal;

	public Cachorro(String nome, String raca, float peso, String cor, String tipoAnimal) {
		super(nome, raca, peso, cor);
		this.tipoAnimal = tipoAnimal;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public String toString() {
		return "Cachorro [tipoAnimal=" + tipoAnimal + ", nome=" + getNome() + ", raca=" + getRaca()
				+ ", peso=" + getPeso() + ", cor=" + getCor() + "]";
	}
	
	
}
