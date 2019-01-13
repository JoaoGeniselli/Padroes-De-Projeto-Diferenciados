package command.violao;

public enum Nota {
    E2(82.40689),
    F2(87.30706),
    F2_SUSTENIDO(92.49861),
    G2(97.99886),
    G2_SUSTENIDO(103.8262),
    A2(110.0000),
    A2_SUSTENIDO(116.5409),
    B2(123.4708),
    C3(130.8128),
    C3_SUSTENIDO(138.5913),
    D3(146.8324),
    D3_SUSTENIDO(155.5635),
    E3(164.8138),
    F3(174.6141),
    F3_SUSTENIDO(184.9972),
    G3(195.9977),
    G3_SUSTENIDO(207.6523),
    A3(220.0000),
    A3_SUSTENIDO(233.0819),
    B3(246.9417),
    C4(261.6256),
    C4_SUSTENIDO(277.1826),
    D4(293.6648),
    D4_SUSTENIDO(311.1270),
    E4(329.6276),
    F4(349.2282),
    F4_SUSTENIDO(369.9944),
    G4(391.9954),
    G4_SUSTENIDO(415.3047),
    A4(440.0000),
    A4_SUSTENIDO(466.1638),
    B4(493.8833),
    C5(523.2511),
    C5_SUSTENIDO(554.3653),
    D5(587.3295),
    D5_SUSTENIDO(622.2540),
    E5(659.2551);

    private final double frequencia;

    Nota(double frequencia) {
        this.frequencia = frequencia;
    }

}
