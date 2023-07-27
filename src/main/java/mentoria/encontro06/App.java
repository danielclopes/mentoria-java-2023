package mentoria.encontro06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	private static final int TAM = 3;

	public static void main(String[] args) {
		String[] amigosArray1 = { "Fulano", "Cicrano", "Beltrano" };
		Float[] amigosArray2 = new Float[3];
		String[][] amigosArray3 = new String[TAM][TAM];

		List<String> amigosArrayList1 = new ArrayList<>();
		amigosArrayList1.add("Fulano");
		amigosArrayList1.add("Cicrano");
		amigosArrayList1.add("Beltrano");
		
		amigosArrayList1.add(1, "Ciclano");
		Collections.sort(amigosArrayList1); //Iterable & Iterator, Comparable & Comparator

		for (String str : amigosArrayList1) {
			System.out.println(str);
		}

		/*
		 * amigosArray2 = amigosArray1.clone(); amigosArray1[1] = "Ciclano";
		 * 
		 * for (int pos = 0; pos < amigosArray2.length; pos++) {
		 * System.out.println(amigosArray2[pos]); }
		 * 
		 * amigosArray3[1][2] = "Leôncio";
		 * 
		 * for (int x = 0; x < TAM; x++) { for (int y = 0; y < TAM; y++) {
		 * System.out.print(amigosArray3[x][y] + " "); } System.out.print("\n"); }
		 */
	}
}
