package adapter.festa.fantasia;

// Adaptador

public abstract class Fantasia implements Fantasiado {

    protected Pessoa pessoa;

    public Fantasia(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String bebidaFavorita() {
        return pessoa.obterBebidaFavorita();
    }
}
