package mentoria.encontro02;

public class App {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Preto", "Gol");
		Carro carro2 = new Carro("Branco", "Chevette");

		System.out.println(carro1 + "\n" + carro2);
		System.out.println("Tipo motor: " + CarroUtil.motor);
	}

}
