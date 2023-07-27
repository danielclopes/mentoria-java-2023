package mentoria.encontro03;

public class Conta {

	private static final double PERCENTUAL_IOF = 0.018;
	private int numero;
	private double saldo;
	private String nomeTitular;

	public Conta() {}

	public Conta(int numero, double saldo, String nomeTitular) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public void sacar(double valor) {
		if (valor <= saldo)
			this.saldo = saldo - (valor + calculaIOF(valor));
		else
			throw new IllegalArgumentException("Saque não permitido, devido a limite insuficiente");
//			System.err.println("Saque não permitido, devido a limite insuficiente");
	}

	private double calculaIOF(double valor) {
		return valor * PERCENTUAL_IOF;
	}

	public void depositar(double valor) {
		if (valor >= 0.0)
			saldo = saldo + valor;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", nomeTitular=" + nomeTitular + "]";
	}
}
