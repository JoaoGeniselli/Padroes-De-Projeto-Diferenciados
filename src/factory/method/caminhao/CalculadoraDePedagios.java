package factory.method.caminhao;

import java.util.Random;

public class CalculadoraDePedagios {

    private int quantidadeDeEixos;
    private final String enderecoInicial;
    private final String enderecoFinal;

    public CalculadoraDePedagios(int quantidadeDeEixos, String enderecoInicial, String enderecoFinal) {
        this.quantidadeDeEixos = quantidadeDeEixos;
        this.enderecoInicial = enderecoInicial;
        this.enderecoFinal = enderecoFinal;
    }

    private static final double VALOR_FIXO_POR_EIXO = 20.00;

    public double calcularGastos() {
        return quantidadeDeEixos * VALOR_FIXO_POR_EIXO * quantidadePedagiosDaRota();
    }

    private int quantidadePedagiosDaRota() {
        // COMPORTAMENTO SIMULADO!
        Random rn = new Random();
        int maximum = 10;
        int minimum = 1;
        int n = maximum - minimum + 1;
        int i = rn.nextInt() % n;
        return minimum + i;
    }
}
