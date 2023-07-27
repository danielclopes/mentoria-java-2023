package mentoria.encontro14;

import java.util.Random;

public class AppMergeSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100);
		}

		System.out.println("Antes:");
		imprimeArray(numeros);

		mergeSort(numeros);

		System.out.println("\n\nDepois:");
		imprimeArray(numeros);
	}

	private static void mergeSort(int[] entradaArray) {
		int tamanhoEntrada = entradaArray.length;

		if (tamanhoEntrada < 2) {
			return;
		}

		int meio = tamanhoEntrada / 2;
		int[] metadeEsquerda = new int[meio];
		int[] metadeDireita = new int[tamanhoEntrada - meio];

		for (int i = 0; i < meio; i++) {
			metadeEsquerda[i] = entradaArray[i];
		}
		for (int i = meio; i < tamanhoEntrada; i++) {
			metadeDireita[i - meio] = entradaArray[i];
		}

		mergeSort(metadeEsquerda);
		mergeSort(metadeDireita);

		merge(entradaArray, metadeEsquerda, metadeDireita);
	}

	private static void merge(int[] entradaArray, int[] metadeEsquerda, int[] metadeDireita) {
		int tamanhoEsquerda = metadeEsquerda.length;
		int tamanhoDireita = metadeDireita.length;

		int i = 0, j = 0, k = 0;

		while (i < tamanhoEsquerda && j < tamanhoDireita) {
			if (metadeEsquerda[i] <= metadeDireita[j]) {
				entradaArray[k] = metadeEsquerda[i];
				i++;
			} else {
				entradaArray[k] = metadeDireita[j];
				j++;
			}
			k++;
		}

		while (i < tamanhoEsquerda) {
			entradaArray[k] = metadeEsquerda[i];
			i++;
			k++;
		}

		while (j < tamanhoDireita) {
			entradaArray[k] = metadeDireita[j];
			j++;
			k++;
		}

	}

	private static void imprimeArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
