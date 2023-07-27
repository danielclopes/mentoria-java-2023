package mentoria.encontro11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MinhaQueue {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();

		fila.add("D");
		fila.add("A");
		fila.add("B");
		fila.add("C");

		/*while (!fila.isEmpty()) {
			System.out.println("Removendo: " + fila.remove());
			System.out.println("Na fila: " + fila);
		}*/
		
		Iterator<String> it = fila.iterator();
		while(it.hasNext()) {
			System.out.println("Elemento: " + it.next());
		}
	}

}
