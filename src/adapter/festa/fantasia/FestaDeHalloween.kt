package adapter.festa.fantasia

import java.util.ArrayList
import java.util.stream.Collectors

// Classe Cliente (usa a interface alvo)

class FestaDeHalloween {

    private val participantes = ArrayList<Fantasiado>()

    fun entrar(fantasiado: Fantasiado) {
        participantes.add(fantasiado)
    }

    fun exibirParticipantesQueBebem(nomeDaBebida: String) {
        val correspondentes = filtrarPorBebida(nomeDaBebida)
        println("Participantes que bebem $nomeDaBebida")
        exibirParticipantes(correspondentes)
    }

    private fun filtrarPorBebida(nomeDaBebida: String): List<Fantasiado> {
        return participantes.filter {
            it.bebidaFavorita() == nomeDaBebida
        }
    }

    fun exibirTodosOsParticipantes() {
        println("Participantes da Festa de Halloween")
        exibirParticipantes(participantes)
    }

    fun exibirParticipantes(participantes: List<Fantasiado>) {
        participantes.forEach { p ->
            println("")
            println("Nome do Personagem: " + p.nomeDoPersonagem())
            println("Descrição da Aparencia: " + p.descricaoDaRoupa())
            println("Bebida Favorita: " + p.bebidaFavorita())
        }
        println("")
    }
}
