package adapter.festa.fantasia

// Adaptador especializado

class RoupaDeVampiro(pessoa: Pessoa) : Fantasia(pessoa) {

    override fun nomeDoPersonagem(): String {
        return "O Vampiro " + pessoa.obterNome()
    }

    override fun descricaoDaRoupa(): String {
        return "Aparencia elegante com capa e uma dentadura com dentes afiados"
    }
}
