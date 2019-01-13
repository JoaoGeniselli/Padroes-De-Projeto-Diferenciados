package command.violao;

import java.util.HashMap;
import java.util.Map;

import static command.violao.Corda.*;

public class Violao {

    private Map<Integer, Corda> cordas;

    public Violao() {
        cordas = new HashMap<>();

        cordas.put(1, E_AGUDO);
        cordas.put(2, B);
        cordas.put(3, G);
        cordas.put(4, D);
        cordas.put(5, A);
        cordas.put(6, E_GRAVE);
    }

    public Nota notaNaPosicao(Integer numeroCorda, Integer numeroCasa) {
        if (numeroCorda < 1 || numeroCorda > 6) throw new CordaInexistenteException(numeroCorda);
        Corda corda = cordas.get(numeroCorda);
        return corda.obterNotaDaCasa(numeroCasa);
    }

}
