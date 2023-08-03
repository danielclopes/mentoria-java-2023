package mentoria.encontro16;

import java.util.Arrays;

public class BuscaBinariaApp {

	public static void main(String[] args) {
		int[] array = { 85, 61, 79, 34, 67, 96, 81, 51, 84, 44 };

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		System.out.println(buscaBinaria(array, 5));

	}

	private static int buscaBinaria(int[] array, int valor) {
		return buscaBinariaIterativa(array, valor);
//		return buscaBinariaRecursiva(array, 0, array.length - 1, valor);
	}

	private static int buscaBinariaIterativa(int[] array, int valor) {
		int inicio, meio, fim;
		inicio = 0;
		fim = array.length - 1;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;

			if (array[meio] == valor)
				return meio;
			else if (array[meio] < valor)
				inicio = meio + 1;
			else if (array[meio] > valor)
				fim = meio - 1;
		}

		return -1;
	}

	private static int buscaBinariaRecursiva(int[] array, int inicio, int fim, int valor) {
		int meio = (inicio + fim) / 2;
		int valorMeio = array[meio];

		if (inicio > fim)
			return -1;
		else if (valorMeio == valor)
			return meio;
		else if (valorMeio < valor)
			return buscaBinariaRecursiva(array, meio + 1, fim, valor);
		else
			return buscaBinariaRecursiva(array, inicio, meio - 1, valor);
	}

}
