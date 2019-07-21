package builder.restaurante;

import java.util.List;

import static builder.restaurante.Pedido.Estado.NA_FILA;

public class Pedido {

    // TODO: FAZER OBSERVADORES DE ESTADO

    private final long senha;
    private final List<PedidoDeItem> itens;
    private Estado estado;

    private Pedido(long senha, List<PedidoDeItem> itens) {
        this.senha = senha;
        this.itens = itens;
        this.estado = NA_FILA;
    }

    public long obterSenha() {
        return senha;
    }

    public static Pedido criarParaItens(List<PedidoDeItem> itensPedidos) {
        return new Pedido(Senha.criarNovaSenha(), itensPedidos);
    }

    enum Estado {
        NA_FILA,
        PREPARO_EM_ANDAMENTO,
        PRONTO_PARA_CONSUMO
    }
}
