package factory.method.caminhao;

public enum TipoCarga {
    SOLIDOS(5000.0),
    LIQUIDOS(4350.0),
    VEICULOS(32000.0);

    public final double valorMedioDeSeguros;

    TipoCarga(double valorMedioDeSeguros) {
        this.valorMedioDeSeguros = valorMedioDeSeguros;
    }
}
