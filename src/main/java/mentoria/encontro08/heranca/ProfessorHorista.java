package mentoria.encontro08.heranca;

public class ProfessorHorista extends Professor {

	private int qtdHoras;
	private double salarioHora;

	public ProfessorHorista() {
		super();
	}

	public ProfessorHorista(String nome, String matricula, int idade, int qtdHoras, double salarioHora) {
		super(nome, matricula, idade);
		this.qtdHoras = qtdHoras;
		this.salarioHora = salarioHora;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

}
