package orientacao.objetos.polimorfismo.reciclagem;

public class GarrafaPetDeRefrigerante extends Frasco implements MaterialReciclavel.Plastico, Produto {

    protected GarrafaPetDeRefrigerante(double capacidadeMaxima) {
        super(capacidadeMaxima);
    }

    @Override
    public String descricaoDoProduto() {
        return "Refrigerante";
    }

    @Override
    public double precoSugerido() {
        return 3.50;
    }

    public static GarrafaPetDeRefrigerante comMLs(double capacidadeEmMLs) {
        return new GarrafaPetDeRefrigerante(capacidadeEmMLs);
    }
}
