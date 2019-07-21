package builder.restaurante;

import java.util.ArrayList;
import java.util.List;

public class AnotacaoDePedido {

    private List<PedidoDeItem> itensPedidos = new ArrayList<>();

    public AnotacaoDePedido adicionarPrato(Prato prato, int quantidade, String comentario) {
        PedidoDeItem item = PedidoDeItem.paraPrato(prato, quantidade, comentario);
        itensPedidos.add(item);
        return this;
    }

    public AnotacaoDePedido adicionarBebida(Bebida bebida, int quantidade, String comentario) {
        PedidoDeItem item = PedidoDeItem.paraBebida(bebida, quantidade, comentario);
        itensPedidos.add(item);
        return this;
    }

    public void soIsso() {

    }

    public Pedido montarPedido() {
        return Pedido.criarParaItens(itensPedidos);
    }
}
