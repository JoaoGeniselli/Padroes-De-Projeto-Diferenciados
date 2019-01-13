package factory.method.caminhao;

public class ExemploCaminhao {

    public static void main(String[] args) {
        Transportadora transportadora = new Transportadora();

        Carga carga1 = new Carga(
                35.000,
                TipoCarga.SOLIDOS,
                "Endereço A",
                "Endereço B",
                7435.00
        );

        double valorDaCarga = transportadora.calcularOrcamentoDaCarga(carga1);

        System.out.println("Valor da carga: " + valorDaCarga);
    }
}
