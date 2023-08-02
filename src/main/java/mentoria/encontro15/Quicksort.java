package mentoria.encontro15;

import java.util.Random;

public class Quicksort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(10);
		}

		System.out.println("Antes:");
		imprimeArray(numeros);

		quicksort(numeros);

		System.out.println("\nDepois:");
		imprimeArray(numeros);
	}

	private static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}

	private static void quicksort(int[] array, int lowIndex, int highIndex) {

		if (lowIndex >= highIndex)
			return;

		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);

		int leftPointer = partition(array, lowIndex, highIndex, pivot);

		quicksort(array, lowIndex, leftPointer - 1);
		quicksort(array, leftPointer + 1, highIndex);

	}

	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex - 1;

		while (leftPointer < rightPointer) {

			// Vem a partir da esquerda ate encontrar um numero maior que o 
			// pivo ou colidir com o rightPointer.
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			// Vem a partir da direita ate encontrar um numero menor que o
			// pivo ou colidir com o leftPointer.
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			swap(array, leftPointer, rightPointer);
		}

		if (array[leftPointer] > array[highIndex]) {
			swap(array, leftPointer, highIndex);
		} else {
			leftPointer = highIndex;
		}

		return leftPointer;
	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	private static void imprimeArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
