package factory.method.caminhao.veiculos;

public class CaminhaoCegonha extends Caminhao implements VeiculoRastreado24H {

    private GPS gps = new GPS();

    @Override
    public int quantidadeDeEixos() {
        return 5;
    }

    @Override
    public CoordenadasGeograficas obterLocalizacaoEmCoordenadas() {
        return new CoordenadasGeograficas(
                gps.latitudeAtual(),
                gps.longitudeAtual()
        );
    }

    public static class GPS {

        double latitudeAtual() {
            // COMPORTAMENTO SIMULADO
            return 0.000;
        }

        double longitudeAtual() {
            // COMPORTAMENTO SIMULADO
            return 0.000;
        }
    }
}
