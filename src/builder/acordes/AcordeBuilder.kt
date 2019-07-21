package builder.acordes

class AcordeBuilder {

    private val notas = mutableListOf<Nota>()
    private var nome: String? = null

    fun nome(nome: String): AcordeBuilder {
        this.nome = nome
        return this
    }

    fun cordaSolta(corda: Corda): AcordeBuilder {
        notas.add(Nota(corda, 0, Dedo.NENHUM))
        return this
    }

    fun nota(corda: Corda, casa: Int, dedo: Dedo): AcordeBuilder {
        notas.add(Nota(corda, casa, dedo))
        return this
    }

    fun build() = Acorde(nome, notas)
}

class Acorde(val nome: String?, val notas: List<Nota>) {

    fun exibirCifra() {
        ImpressoraDeCifra(this).exibirCifra()
    }
}

data class Nota(val corda: Corda, val casa: Int, val dedo: Dedo)

enum class Dedo(val digito: Int) {
    NENHUM(0),
    INDICADOR(1),
    MEDIO(2),
    ANELAR(3),
    MINIMO(4)
}

enum class Corda(val numero: Int, val cifra: Char) {
    MI_AGUDA(1, 'e'),
    SI(2, 'B'),
    SOL(3, 'G'),
    RE(4, 'D'),
    LA(5, 'A'),
    MI_GRAVE(6, 'E')
}
