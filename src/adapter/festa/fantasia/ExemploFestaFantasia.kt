package adapter.festa.fantasia

object ExemploFestaFantasia {

    @JvmStatic
    fun main(args: Array<String>) {

        val festa = FestaDeHalloween()

        // Primeiros participantes a chegar

        val joao = Pessoa("João", "Refrigerante")
        val lucas = Pessoa("Lucas", "Suco de Laranja")
        val gabriel = Pessoa("Gabriel", "Cerveja")
        val fabio = Pessoa("Fabio", "Refrigerante")

        festa.entrar(RoupaDeFantasma(joao))
        festa.entrar(RoupaDeVampiro(lucas))
        festa.entrar(RoupaDeCaveira(gabriel))
        festa.entrar(RoupaDeVampiro(fabio))

        festa.exibirParticipantesQueBebem("Refrigerante")
        // Saída: João e Fábio

        festa.exibirTodosOsParticipantes()
    }

}
