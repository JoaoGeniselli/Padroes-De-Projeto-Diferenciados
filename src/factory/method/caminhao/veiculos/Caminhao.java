package factory.method.caminhao.veiculos;

import factory.method.caminhao.*;
import factory.method.caminhao.api.nacional.TabelaNacionalDeCapacidades;

public abstract class Caminhao {

    public static Caminhao adequadoParaACarga(Carga carga) {
        if (carga.tipo == TipoCarga.LIQUIDOS) return new CaminhaoTanque();
        if (carga.tipo == TipoCarga.VEICULOS) return new CaminhaoCegonha();
        if (carga.tipo == TipoCarga.SOLIDOS) return obterTipoPorPeso(carga);
        throw new TipoDeCargaDesconhecidoException();
    }

    private static Caminhao obterTipoPorPeso(Carga carga) {
        if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_TOCO) {
            return new Toco();
        } else if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_TRUCK) {
            return new Truck();
        } else if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_CARRETA) {
            return new Carreta();
        } else if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_BITREM) {
            return new Bitrem();
        } else if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_RODOTREM) {
            return new RodoTrem();
        } else {
            throw new PesoDeCargaImcompativelException();
        }
    }

    public abstract int quantidadeDeEixos();
}
