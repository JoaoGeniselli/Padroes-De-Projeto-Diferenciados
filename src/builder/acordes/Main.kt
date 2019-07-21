package builder.acordes

fun main(args: Array<String>) {

    // Exemplo de utilização do builder sem director

    val miMenor = AcordeBuilder()
            .nome("Em")
            .cordaSolta(Corda.MI_AGUDA)
            .cordaSolta(Corda.SI)
            .cordaSolta(Corda.SOL)
            .nota(Corda.RE, 2, Dedo.ANELAR)
            .nota(Corda.LA, 2, Dedo.MEDIO)
            .cordaSolta(Corda.MI_GRAVE)
            .build()

    miMenor.exibirCifra()

    println()

    // Exemplos de utilização do builder com directors

    var builder = AcordeBuilder()
    ReMaiorDirector().construir(builder)
    val reMaior = builder.build()
    reMaior.exibirCifra()

    println()

    builder = AcordeBuilder()
    SolMaiorDirector().construir(builder)
    val solMaior = builder.build()
    solMaior.exibirCifra()

    println()

    builder = AcordeBuilder()
    DoMenorDirector().construir(builder)
    val doMenor = builder.build()
    doMenor.exibirCifra()
}