package mentoria.encontro05;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Item> itens = new ArrayList<>();
		itens.add(new Item(0));
		itens.add(new Item(1));
		itens.add(new Item(2));
		itens.add(new Item(3));
		itens.add(new Item(4));
		
		for (Item i : itens) {
			System.out.println("Item id: " + i.getId());
		}
		
//		for (int j = 0; j < itens.size(); j++) {
//			Item item = itens.get(j);
//			System.out.println("Item id: " + item.getId());
//		}
		
//		itens.forEach(id -> System.out.println("Item id: " + id.getId()));
	}

}
