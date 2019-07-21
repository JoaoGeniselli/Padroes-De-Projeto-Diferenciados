package adapter.festa.fantasia

// Adaptador especializado

class RoupaDeFantasma(pessoa: Pessoa) : Fantasia(pessoa) {

    override fun nomeDoPersonagem(): String {
        return "O Fantasma " + pessoa.obterNome()
    }

    override fun descricaoDaRoupa(): String {
        return "Um lençol com furos para os olhos"
    }

    override fun bebidaFavorita(): String {
        return pessoa.obterBebidaFavorita()
    }
}
