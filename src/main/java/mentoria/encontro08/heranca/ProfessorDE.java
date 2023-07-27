package mentoria.encontro08.heranca;

public class ProfessorDE extends Professor {

	private double salario;

	public ProfessorDE() {
		super();
	}

	public ProfessorDE(String nome, String matricula, int idade, double salario) {
		super(nome, matricula, idade);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "ProfessorDE [salario=" + salario + ", nome=" + getNome() + ", matricula=" + getMatricula()
				+ ", idade=" + getIdade() + "]";
	}

}
