package mentoria.encontro07;

/**
 * Isso é um exemplo de Herança
 * @author Daniel Lopes
 * @since encontro 7
 *
 */
public class OutraForma extends Circulo {

	private double altura;

	OutraForma() {

	}

	OutraForma(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return 2 * super.getArea() + 2 * Math.PI * super.getRaio() * altura;
	}

	@Override
	public double getVolume() {
		return super.getArea() * altura;
	}

	@Override
	public String getNome() {
		return "Outro Cilindro";
	}
}
