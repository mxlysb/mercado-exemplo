import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produto, 10L);
		ProdutoRepository catalogo = new ProdutoRepository();
		
		System.out.println(produto);
		System.out.println(lote);

		Produto pao = new Produto("pão", "Daniel Fonseca Italino");
		Produto ovo = new Produto("ovo", "Raiani Egg's");

		catalogo.addProduto(pao);
		catalogo.addProduto(ovo);
	}
}
