package mentoria.encontro14;

public class AppBubbleSort {

	private static final int SIZE = 1000000;

	public static void main(String[] args) {
		int[] arr = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		System.out.println("Antes:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		bubbleSort(arr);
		
		System.out.println("\n\nDepois:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int x = 1; x < (n - i); x++) {
				if (arr[x - 1] > arr[x]) {
					temp = arr[x - 1];
					arr[x - 1] = arr[x];
					arr[x] = temp;
				}

			}
		}
	}
}
