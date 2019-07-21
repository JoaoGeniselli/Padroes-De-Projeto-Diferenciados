package adapter.festa.fantasia

// Classe adaptada

class Pessoa(private val nome: String, private val bebidaFavorita: String) {

    fun obterNome(): String {
        return nome
    }

    fun obterBebidaFavorita(): String {
        return bebidaFavorita
    }


}
