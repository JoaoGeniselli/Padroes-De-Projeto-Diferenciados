package orientacao.objetos.polimorfismo.reciclagem;

import java.util.ArrayList;
import java.util.List;

public class Geladeira {

    private List<GarrafaPetDeRefrigerante> refrigerantesDisponiveis = new ArrayList<>();

    public void colocarGarrafa(GarrafaPetDeRefrigerante garrafa) {
        refrigerantesDisponiveis.add(garrafa);
    }

    public GarrafaPetDeRefrigerante obterUmaGarrafaParaServir() {
        if (refrigerantesDisponiveis.isEmpty()) throw new GeladeiraVaziaException();
        GarrafaPetDeRefrigerante garrafa = refrigerantesDisponiveis.get(0);
        refrigerantesDisponiveis.remove(garrafa);
        return garrafa;
    }

    public class GeladeiraVaziaException extends RuntimeException {

        @Override
        public String getMessage() {
            return "Acabou o refri :(";
        }
    }
}
