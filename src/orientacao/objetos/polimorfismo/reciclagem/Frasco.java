package orientacao.objetos.polimorfismo.reciclagem;

public abstract class Frasco {

    public final double capacidadeMaxima;
    private double quantidadeDeLiquidoAtual;

    protected Frasco(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean estaVazia() {
        return quantidadeDeLiquidoAtual == 0.0;
    }

    public boolean estaCheia() {
        return quantidadeDeLiquidoAtual == capacidadeMaxima;
    }

    public void encher(double mlsLiquido) {
        quantidadeDeLiquidoAtual = Math.min(capacidadeMaxima, (quantidadeDeLiquidoAtual + mlsLiquido));
    }
}
