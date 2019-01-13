package adapter.festa.fantasia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Classe Cliente (usa a interface alvo)

public class FestaDeHalloween {

    private List<Fantasiado> participantes = new ArrayList<>();

    public void entrar(Fantasiado fantasiado) {
        participantes.add(fantasiado);
    }

    public void exibirParticipantesQueBebem(String nomeDaBebida) {
        List<Fantasiado> correspondentes = filtrarPorBebida(nomeDaBebida);
        System.out.println("Participantes que bebem " + nomeDaBebida);
        exibirParticipantes(correspondentes);
    }

    private List<Fantasiado> filtrarPorBebida(String nomeDaBebida) {
        return participantes.stream().filter((p) -> {
            return p.bebidaFavorita().equals(nomeDaBebida);
        }).collect(Collectors.toList());
    }

    public void exibirTodosOsParticipantes() {
        System.out.println("Participantes da Festa de Halloween");
        exibirParticipantes(participantes);
    }

    public void exibirParticipantes(List<Fantasiado> participantes) {
        participantes.forEach((p) -> {
            System.out.println("");
            System.out.println("Nome do Personagem: " + p.nomeDoPersonagem());
            System.out.println("Descrição da Aparencia: " + p.descricaoDaRoupa());
            System.out.println("Bebida Favorita: " + p.bebidaFavorita());
        });
        System.out.println("");
    }
}
