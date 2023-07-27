package mentoria.encontro07.genericos;

public class App {

	public static void main(String[] args) {
		Produto p1 = new Produto(1,"Caneta", 4.9);
		ProdutoG<String> p2 = new ProdutoG<String>("E1421", "Folhas A4 maço com 500f", 25.98);
		ProdutoG<Integer> p3 = new ProdutoG<Integer>(104, "Fita adesiva pequena", 3.79);
		
		System.out.println(p2 + "\n" + p3);
	}

}
