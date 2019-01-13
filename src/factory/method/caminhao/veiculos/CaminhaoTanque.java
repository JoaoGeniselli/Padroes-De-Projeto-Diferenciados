package factory.method.caminhao.veiculos;

import java.util.Arrays;
import java.util.List;

public class CaminhaoTanque extends Caminhao implements VeiculoDeCargasEspeciais {

    @Override
    public int quantidadeDeEixos() {
        return 4;
    }

    @Override
    public List<String> obterAutorizacoesDeTransporte() {
        return Arrays.asList("líquidos inflamáveis", "líquidos corrosivos");
    }
}
