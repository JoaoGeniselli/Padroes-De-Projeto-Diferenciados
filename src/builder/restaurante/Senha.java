package builder.restaurante;

public class Senha {

    private static long senhaAtual = 0;

    public static long criarNovaSenha() {
        senhaAtual++;
        return senhaAtual;
    }
}
