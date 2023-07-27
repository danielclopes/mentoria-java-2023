package mentoria.encontro07;

public class App {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.setRaio(2.5);

		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(4.0);
		cilindro.setCirculo(c1);

		System.out.println("Area = " + cilindro.getArea() + "\nVolume = " + cilindro.getVolume());

		OutraForma cilindro2 = new OutraForma(2.5, 4.0);
		System.out.println("Area = " + cilindro2.getArea() + "\nVolume = " + cilindro2.getVolume() + "\nNome = "
				+ cilindro2.getNome());

		FormaGeometrica f2 = new Ponto();
		FormaGeometrica f3 = new Circulo();

		if (f3 instanceof Ponto)
			System.out.println("É Ponto");
		if (f3 instanceof Circulo)
			System.out.println("É Circulo");
	}
}
