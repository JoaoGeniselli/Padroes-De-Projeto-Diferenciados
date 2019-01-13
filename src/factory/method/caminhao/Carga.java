package factory.method.caminhao;

public class Carga {

    public final double peso;
    public final TipoCarga tipo;
    public final String enderecoDeColeta;
    public final String enderecoDeEntrega;
    public final double freteNegociado;

    public Carga(double peso, TipoCarga tipo, String enderecoDeColeta, String enderecoDeEntrega, double freteNegociado) {
        this.peso = peso;
        this.tipo = tipo;
        this.enderecoDeColeta = enderecoDeColeta;
        this.enderecoDeEntrega = enderecoDeEntrega;
        this.freteNegociado = freteNegociado;
    }


}
