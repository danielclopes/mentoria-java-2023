package mentoria.encontro11;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinhaPriorityQueue {

	public static void main(String[] args) {
		Queue<String> fila = new PriorityQueue<String>();
		
		fila.add("C");
		fila.add("D");
		fila.add("B");
		fila.add("A");

//		while (!fila.isEmpty()) {
//			System.out.println("Removendo: " + fila.remove());
//			System.out.println("Na fila: " + fila);
//		}

		Iterator<String> it = fila.iterator();
		while(it.hasNext()) {
			System.out.println("Elemento: " + it.next());
		}
	}

}
