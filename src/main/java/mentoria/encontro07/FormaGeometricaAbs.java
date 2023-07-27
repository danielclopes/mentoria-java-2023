package mentoria.encontro07;

public abstract class FormaGeometricaAbs {

		public abstract double getArea();

		public abstract double getVolume();

		public abstract String getNome();
		
		public String getValidade() {
			return "Vencido";
		}
}
