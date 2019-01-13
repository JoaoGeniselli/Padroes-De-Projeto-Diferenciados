package factory.method.caminhao.veiculos;

public class Toco extends Caminhao implements VeiculoSemiPesado {

    @Override
    public int quantidadeDeEixos() {
        return 2;
    }
}
