package orientacao.objetos.polimorfismo.reciclagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mercado {

    private List<Produto> produtosAVenda = new ArrayList<>();

    public void colocarProdutoAVenda(Produto produto) {
        produtosAVenda.add(produto);
    }

    public List<Produto> obterProdutosAVenda() {
        return Collections.unmodifiableList(produtosAVenda);
    }
}
