package builder.acordes

import kotlin.math.max

class ImpressoraDeCifra(private val acorde: Acorde) {

    private val intervaloNotas = obterIntervaloDeCasas()
    private val quantidadeDeCasas = max(intervaloNotas.endInclusive - intervaloNotas.start, 4)
    private val notasPorCorda = acorde.notas.map { it.corda to it }.toMap()

    fun exibirCifra() = with(acorde) {
        nome?.let { println("Acorde: $it\n") }
        Corda.values().forEach { corda ->
            exibirCabecalhoDaCorda(corda)
            notasPorCorda[corda]?.let { notaDaCorda ->
                exibirCordaComNota(notaDaCorda)
            } ?: run {
                exibirCordaSemNota(corda)
            }
        }
        exibirCasaInicialDaCifra()
    }

    private fun exibirCabecalhoDaCorda(corda: Corda) = print("${corda.cifra} |")

    private fun exibirCasaInicialDaCifra() = println("  ${intervaloNotas.start - 1}")

    private fun exibirCordaComNota(notaDaCorda: Nota) {
        val casaDaNotaNaCifra = notaDaCorda.casa - intervaloNotas.start
        for (i in 0..quantidadeDeCasas) {
            when (i) {
                casaDaNotaNaCifra -> print(notaDaCorda.dedo.digito)
                else -> print("-")
            }
        }
        println(" o")
    }

    private fun exibirCordaSemNota(corda: Corda) {
        for (i in 0..quantidadeDeCasas) {
            print("-")
        }
        println(" x")
    }

    private fun obterIntervaloDeCasas(): IntRange = with(acorde) {
        val notasOrdenadasPorCasa = notas
                .filter { it.casa != 0 }
                .sortedBy { it.casa }
        return when {
            notasOrdenadasPorCasa.isEmpty() -> IntRange.EMPTY
            else -> IntRange(notasOrdenadasPorCasa.first().casa - 1, notasOrdenadasPorCasa.last().casa)
        }
    }
}