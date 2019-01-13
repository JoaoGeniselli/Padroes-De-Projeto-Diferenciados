package command.violao;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import java.util.Arrays;
import java.util.List;

import static command.violao.Nota.*;

public enum Corda {
    E_AGUDO(E4, F4, F4_SUSTENIDO, G4, G4_SUSTENIDO, A4, A4_SUSTENIDO, B4, C5, C5_SUSTENIDO, D5, D5_SUSTENIDO, E5),
    B(B3, C4, C4_SUSTENIDO, D4, D4_SUSTENIDO, E4, F4, F4_SUSTENIDO, G4, G4_SUSTENIDO, A4, A4_SUSTENIDO, B4),
    G(G3, G3_SUSTENIDO, A3, A3_SUSTENIDO, B3, C4, C4_SUSTENIDO, D4, D4_SUSTENIDO, E4, F4, F4_SUSTENIDO, G4),
    D(D3, D3_SUSTENIDO, E3, F3, F3_SUSTENIDO, G3, G3_SUSTENIDO, A3, A3_SUSTENIDO, B3, C4, C4_SUSTENIDO, D4),
    A(A2, A2_SUSTENIDO, B2, C3, C3_SUSTENIDO, D3, D3_SUSTENIDO, E3, F3, F3_SUSTENIDO, G3, G3_SUSTENIDO, A3),
    E_GRAVE(E2, F2, F2_SUSTENIDO, G2, G2_SUSTENIDO, A2, A2_SUSTENIDO, B2, C3, C3_SUSTENIDO, D3, D3_SUSTENIDO, E3);

    public static final Integer CASA_CORDA_SOLTA = 0;
    public static final Integer ULTIMA_CASA = 12;

    public List<Nota> notas;

    Corda(Nota ... notas) {
        this.notas = Arrays.asList(notas);
    }

    public Nota obterNotaDaCasa(Integer numeroCasa) {
        if (numeroCasa < CASA_CORDA_SOLTA || numeroCasa > ULTIMA_CASA)
            throw new CasaInexistenteException(numeroCasa);
        return notas.get(numeroCasa);
    }
}
