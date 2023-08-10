package mentoria.encontro17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaApp {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 6);
		List<String> nomes = Arrays.asList("Adao", "Carlos", "Bianca", "Eraldo", "Danilo", "Camila");

//		for (String nome : nomes) {
//			System.out.println(nome.toUpperCase());
//		}
		
		String resultado = nomes.stream()
					.filter(n -> n.startsWith("C"))
					.collect(Collectors.joining(", "));
		
		System.out.println(resultado);
		
		nomes.forEach(System.out::println);
		
		nomes.stream()
			.map(n -> n.toUpperCase())
			.forEach(System.out::println);

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Adao", 65));
		pessoas.add(new Pessoa("Bianca", 25));
		pessoas.add(new Pessoa("Carlos", 42));
		pessoas.add(new Pessoa("Danilo", 38));
		pessoas.add(new Pessoa("Eraldo", 54));
		pessoas.add(new Pessoa("Camila", 29));

		int somaIdades = pessoas.stream()
							.filter(p -> p.getIdade() < 40)
							.mapToInt(Pessoa::getIdade)
							.sum();
		System.out.println(somaIdades);
		
		Collections.sort(nomes, new Comparator<String>() {
			public int compare(String nome1, String nome2) {
				return nome1.compareTo(nome2);
			}
		});
		
		System.out.println(nomes);
		
		nomes.sort((nome1, nome2) -> nome1.compareTo(nome2));
		
		System.out.println(nomes);
	}

}
