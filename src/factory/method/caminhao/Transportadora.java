package factory.method.caminhao;

import factory.method.caminhao.veiculos.Caminhao;

public class Transportadora {

    public double calcularOrcamentoDaCarga(Carga carga) {
        double valorOrcamento = 0.0;

        Caminhao caminhao = Caminhao.adequadoParaACarga(carga);

        CalculadoraDePedagios pedagios = new CalculadoraDePedagios(
                caminhao.quantidadeDeEixos(),
                carga.enderecoDeColeta,
                carga.enderecoDeEntrega,
                20.0
        );

        valorOrcamento += pedagios.calcularGastos();
        valorOrcamento += carga.freteNegociado;
        valorOrcamento += carga.tipo.valorMedioDeSeguros;
        // outros gastos como: combustível, manutenção...

        return valorOrcamento;
    }
}
