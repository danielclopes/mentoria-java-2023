package mentoria.encontro09;

public class App {
	/*
	 * try catch finally throw throws propagação
	 */
	public static void main(String[] args) {
		int[] array1 = { 6, 4, 12 };
		int[] array2 = { 2, 2, 2 };

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Resultado: " + divisor(array1[i], array2[i]));
		}
		
		String str = "25";
		converteStringToInt(str);
	}
	
	private static void converteStringToInt(String str) {
		int numero = Integer.parseInt(str);
		System.out.println(numero + 10);
	}

	private static int divisor(int numerador, int denominador) {
		Integer resultado = null;

		try {
			resultado = numerador / denominador;
//		} catch (ArithmeticException e) {
//			throw new ArithmeticException("Erro na aplicação: " + e.getMessage());
		} catch (Exception e) {
			throw new DivisaoPorZeroException("Divisão por zero");
		}
		
		return resultado;
	}

}
