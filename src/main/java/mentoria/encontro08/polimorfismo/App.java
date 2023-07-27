package mentoria.encontro08.polimorfismo;

public class App {

	public static void main(String[] args) {

		Nota nfs1 = new NotaPortoAlegre(50.0);
		Nota nfs2 = new NotaCanoas(20.0);
		
		servico(nfs1);
		servico(nfs2);
	}
	
	public static void servico(Nota nota) {
		if(nota instanceof NotaPortoAlegre)
			servicoPortoAlegre(nota);
		if(nota instanceof NotaCanoas)
			servicoCanoas(nota);
	}

	private static void servicoCanoas(Nota nota) {
		System.out.println("Prefeitura de Canoas");
		System.out.println(nota.calculaISSQN());
		
	}

	private static void servicoPortoAlegre(Nota nota) {
		System.out.println("Prefeitura de Porto Alegre");
		System.out.println(nota.calculaISSQN());
	}

}
