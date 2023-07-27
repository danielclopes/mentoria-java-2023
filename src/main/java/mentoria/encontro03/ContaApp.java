package mentoria.encontro03;

public class ContaApp {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.depositar(400.0);

		System.out.println("Saldo: " + minhaConta.getSaldo());

		minhaConta.sacar(2000.0);

		System.out.println("Saldo: " + minhaConta.getSaldo());
		
		Conta novaConta = new Conta(1234, 100.0, "Patunfio");
		System.out.println(novaConta.toString());
	}

}
