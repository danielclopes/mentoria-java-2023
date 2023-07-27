package mentoria.encontro07;

public class Circulo implements FormaGeometrica {

	private double raio;

	public Circulo() {
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public double getVolume() {
		return 0.0;
	}

	@Override
	public String getNome() {
		return "Círculo";
	}

}
