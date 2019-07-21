package factory.method.caminhao;

import java.util.Random;

public class CalculadoraDePedagios {

    private int quantidadeDeEixos;
    private final String enderecoInicial;
    private final String enderecoFinal;
    private final double precoPorEixo;

    public CalculadoraDePedagios(int quantidadeDeEixos, String enderecoInicial, String enderecoFinal, double precoPorEixo) {
        this.quantidadeDeEixos = quantidadeDeEixos;
        this.enderecoInicial = enderecoInicial;
        this.enderecoFinal = enderecoFinal;
        this.precoPorEixo = precoPorEixo;
    }

    public double calcularGastos() {
        return quantidadeDeEixos * precoPorEixo * quantidadePedagiosDaRota();
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
