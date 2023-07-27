package mentoria.encontro10;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		ArrayList<String> animaisArrayList = new ArrayList<>();
		LinkedList<String> animaisLinkedList = new LinkedList<>();
		
		animaisArrayList.add("Cachorro");
		animaisArrayList.add("Gato");
		animaisArrayList.add("Papagaio");
		
		animaisLinkedList.add("Cachorro");
		animaisLinkedList.add("Gato");
		animaisLinkedList.add("Papagaio");
		
		System.out.println(animaisArrayList.get(1));
		System.out.println(animaisLinkedList.get(2));
	}
}
