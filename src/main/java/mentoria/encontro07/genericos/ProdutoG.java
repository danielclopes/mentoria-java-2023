package mentoria.encontro07.genericos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoG<T> {
	private T codigo;
	private String descricao;
	private double preco;
}
