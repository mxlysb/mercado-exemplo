package exemplo;

import java.util.List;

public class ProdutoService {

    private ProdutoRepository prodRep;
    private LoteRepository loteRep;

    public List<Produto> listarProdutosLote(String nome){
        List<Lote> lotes = loteRep.getAll();
        List<Produto> produtos = getProdutosFromLotes(lotes);
        List<Produto> produtosOK = getProdutosByName(nome, produtos);

        return produtosOK;
    }

    public List<Produto> listarProdutosByName(String nome){
        List<Produto> produtos = prodRep.getAll();
        List<Produto> produtosOK = getPeodutosByName(nome, produtos);

        return produtosOK;
    }
}
