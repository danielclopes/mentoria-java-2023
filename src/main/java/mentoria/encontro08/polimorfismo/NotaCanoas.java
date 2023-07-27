package mentoria.encontro08.polimorfismo;

public class NotaCanoas implements Nota {
	private static final double PERCENTUAL_ISSQN = 0.03;
	private String cnpjEmissor;
	private double valor;

	public NotaCanoas(double valor) {
		this.valor = valor;
	}

	@Override
	public void setCNPJEmissor(String cnpj) {
		this.cnpjEmissor = cnpj;
	}

	@Override
	public double calculaISSQN() {
		return valor * PERCENTUAL_ISSQN;
	}

}
