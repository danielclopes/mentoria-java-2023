package mentoria.encontro13;

import java.util.Hashtable;
import java.util.Map;

public class AppHashtable {
	private static final int INITIAL_CAPACITY = 11;
	
    public static void main(String[] args) throws Exception {
        Hashtable<String, String> tabela = new Hashtable<>(INITIAL_CAPACITY);
        tabela.put("321", "Maria");
        tabela.put("200", "Jose");
        tabela.put("188", "Pedro");
        tabela.put("235", "Luiza");
        tabela.put("425", "Joao");
        tabela.put("682", "Joana");

        System.out.println(tabela);
        for (Map.Entry<String, String> registro : tabela.entrySet()) {
            System.out.println(String.format("Chave: %s | Valor: %s | Hash: %s", 
                registro.getKey(), 
                registro.getValue(),
					registro.getKey().hashCode() % INITIAL_CAPACITY));
        }
    }
}
