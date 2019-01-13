package factory.method.caminhao.veiculos;

public interface VeiculoRastreado24H {
    CoordenadasGeograficas obterLocalizacaoEmCoordenadas();

    class CoordenadasGeograficas {
        final double latitude;
        final double longitude;

        public CoordenadasGeograficas(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }
}
