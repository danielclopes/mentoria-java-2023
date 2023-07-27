package mentoria.encontro12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppSet {

	public static void main(String[] args) {
//		List<String> animaisList = new ArrayList<>();
//		animaisList.add("Gato");
//		animaisList.add("Cachorro");
//		animaisList.add("Papagaio");
//		animaisList.add("Peixe");
//		animaisList.add("Rato");
//		Collections.sort(animaisList);
//		System.out.println(animaisList);
		
		Set<String> animaisSet = new HashSet<>();
		animaisSet.add("Gato");
//		animaisSet.add("Cachorro");
		animaisSet.add("Papagaio");
		animaisSet.add("Peixe");
//		animaisSet.add("Rato");
		animaisSet.add("Aguia");
		System.out.println(animaisSet);
		
		animaisSet.forEach(System.out::println);
		animaisSet.stream().forEach(a -> System.out.println(a.hashCode()%16));
		
	}

}
