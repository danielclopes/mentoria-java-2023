package mentoria.encontro07;

public class Cilindro implements FormaGeometrica {
	private double altura;
	private Circulo circulo;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Circulo getCirculo() {
		return circulo;
	}

	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}

	@Override
	public double getArea() {
		return 2 * circulo.getArea() + 2 * Math.PI * circulo.getRaio() * altura;
	}

	@Override
	public double getVolume() {
		return circulo.getArea() * altura;
	}

	@Override
	public String getNome() {
		return "Cilindro";
	}

}
