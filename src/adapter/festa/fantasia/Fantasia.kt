package adapter.festa.fantasia

// Adaptador

abstract class Fantasia(protected var pessoa: Pessoa) : Fantasiado {

    override fun bebidaFavorita(): String {
        return pessoa.obterBebidaFavorita()
    }
}
