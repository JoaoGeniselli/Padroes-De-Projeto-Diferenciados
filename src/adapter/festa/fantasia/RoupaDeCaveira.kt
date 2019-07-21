package adapter.festa.fantasia

// Adaptador especializado

class RoupaDeCaveira(pessoa: Pessoa) : Fantasia(pessoa) {

    override fun nomeDoPersonagem(): String {
        return "Uma Caveira com a voz do " + pessoa.obterNome()
    }

    override fun descricaoDaRoupa(): String {
        return "Aparencia preta inteira com desenho dos ossos"
    }
}
