package factory.method.caminhao.veiculos;

public class RodoTrem extends Caminhao implements VeiculoLongo {

    @Override
    public int quantidadeDeEixos() {
        return 9;
    }

    @Override
    public double comprimentoTotalEmMetros() {
        return 30.0;
    }
}
