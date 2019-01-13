package factory.method.caminhao.veiculos;

public class Bitrem extends Caminhao implements VeiculoLongo {

    @Override
    public int quantidadeDeEixos() {
        return 7;
    }

    @Override
    public double comprimentoTotalEmMetros() {
        return 19.80;
    }
}
