package builder.restaurante;

public class PedidoDeItem {

    public static PedidoDeItem paraPrato(Prato prato, int quantidade, String comentario) {
        return new PedidoDeItem();
    }

    public static PedidoDeItem paraBebida(Bebida bebida, int quantidade, String comentario) {
        return new PedidoDeItem();
    }
}
