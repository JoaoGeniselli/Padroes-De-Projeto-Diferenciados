package orientacao.objetos.polimorfismo.reciclagem;

public class ExemploReciclagem {

    public static void main(String[] args) {

        FabricaDeRefrigerante fabricaDeRefrigerante = new FabricaDeRefrigerante();
        Mercado mercado = new Mercado();
        Geladeira geladeira = new Geladeira();
        Reciclagem reciclagem = new Reciclagem();

        GarrafaPetDeRefrigerante garrafaDeRefri = GarrafaPetDeRefrigerante.comMLs(2000);

        // Objeto visto como "Frasco"
        fabricaDeRefrigerante.encherFrasco(garrafaDeRefri);

        // Objeto visto como "Produto"
        mercado.colocarProdutoAVenda(garrafaDeRefri);

        // Objeto visto como "GarrafaPetDeRefrigerante"
        geladeira.colocarGarrafa(garrafaDeRefri);

        // Objeto visto como "Plastico"
        reciclagem.reciclar(garrafaDeRefri);
    }
}
