package factory.method.caminhao.errados

import factory.method.caminhao.*
import factory.method.caminhao.api.nacional.TabelaNacionalDeCapacidades
import factory.method.caminhao.veiculos.*

class Transportadora {

    fun calcularOrcamentoDaCarga(carga: Carga): Double {
        var valorOrcamento = 0.0

        val caminhao: Caminhao

        if (carga.tipo == TipoCarga.LIQUIDOS) {
            caminhao = CaminhaoTanque()
        } else if (carga.tipo == TipoCarga.VEICULOS) {
            caminhao = CaminhaoCegonha()
        } else if (carga.tipo == TipoCarga.SOLIDOS) {
            if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_TOCO) {
                caminhao = Toco()
            } else if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_TRUCK) {
                caminhao = Truck()
            } else if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_CARRETA) {
                caminhao = Carreta()
            } else if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_BITREM) {
                caminhao = Bitrem()
            } else if (carga.peso <= TabelaNacionalDeCapacidades.MAXIMO_RODOTREM) {
                caminhao = RodoTrem()
            } else {
                throw PesoDeCargaImcompativelException()
            }
        } else {
            throw TipoDeCargaDesconhecidoException()
        }

        val precoPorEixo: Double

        if (carga.enderecoDeColeta.contains("São Paulo") ||
                carga.enderecoDeColeta.contains("Espírito Santo") ||
                carga.enderecoDeColeta.contains("Minas Gerais") ||
                carga.enderecoDeColeta.contains("Rio de Janeiro")) {
            precoPorEixo = 20.0
        } else if (carga.enderecoDeColeta.contains("Paraná") ||
                carga.enderecoDeColeta.contains("Santa Catarina") ||
                carga.enderecoDeColeta.contains("Rio Grande do Sul")) {
            precoPorEixo = 15.0
        } else {
            precoPorEixo = 10.0
        }

        val pedagios = CalculadoraDePedagios(
                caminhao.quantidadeDeEixos(),
                carga.enderecoDeColeta,
                carga.enderecoDeEntrega,
                precoPorEixo
        )

        valorOrcamento += pedagios.calcularGastos()
        valorOrcamento += carga.freteNegociado
        valorOrcamento += carga.tipo.valorMedioDeSeguros
        // outros gastos como: combustível, manutenção...

        return valorOrcamento
    }
}
