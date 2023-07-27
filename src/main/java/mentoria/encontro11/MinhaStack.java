package mentoria.encontro11;

import java.util.Stack;

public class MinhaStack {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();

		pilha.push("A1");
		pilha.push("B1");
		pilha.push("C1");
		pilha.push("D1");
		
		System.out.println("Pilha: " + pilha);

		while (!pilha.isEmpty()) {
			System.out.println("Removendo: " + pilha.pop());
		}
	}
}
