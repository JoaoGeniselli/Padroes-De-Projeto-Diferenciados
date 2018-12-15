package orientacao.objetos.polimorfismo.reciclagem;

public class FabricaDeRefrigerante {

    public void encherFrasco(Frasco frasco) {
        frasco.encher(frasco.capacidadeMaxima);
    }
}
