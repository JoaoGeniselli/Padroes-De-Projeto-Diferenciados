package builder.acordes

interface AcordeBuilderDirector {
    fun construir(builder: AcordeBuilder)
}

class SolMaiorDirector : AcordeBuilderDirector {

    override fun construir(builder: AcordeBuilder) {
        builder
                .nome("G")
                .nota(Corda.MI_AGUDA, 3, Dedo.MINIMO)
                .nota(Corda.SI, 3, Dedo.ANELAR)
                .cordaSolta(Corda.SOL)
                .cordaSolta(Corda.RE)
                .nota(Corda.LA, 2, Dedo.INDICADOR)
                .nota(Corda.MI_GRAVE, 3, Dedo.MEDIO)
    }
}

class DoMenorDirector : AcordeBuilderDirector {

    override fun construir(builder: AcordeBuilder) {
        builder
                .nome("Cm")
                .nota(Corda.MI_AGUDA, 3, Dedo.INDICADOR)
                .nota(Corda.SI, 4, Dedo.MEDIO)
                .nota(Corda.SOL, 5, Dedo.MINIMO)
                .nota(Corda.RE, 5, Dedo.ANELAR)
                .nota(Corda.LA, 3, Dedo.INDICADOR)
    }
}

class ReMaiorDirector : AcordeBuilderDirector {

    override fun construir(builder: AcordeBuilder) {
        builder
                .nome("D")
                .nota(Corda.MI_AGUDA, 2, Dedo.MEDIO)
                .nota(Corda.SI, 3, Dedo.ANELAR)
                .nota(Corda.SOL, 2, Dedo.INDICADOR)
                .cordaSolta(Corda.RE)
    }
}