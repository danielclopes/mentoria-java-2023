package mentoria.encontro01;

public class Application {
	public static void main(String[] args) {

		Animal cao = new Cachorro("Toto", "Vira lata", 18.5f, "Caramelo", "Cachorro");
		System.out.println(cao);

		Animal gato = new Animal("Missy", "SRD", 2f, "baio");
		System.out.println(gato);
	}
}
