package adapter.festa.fantasia;

// Adaptador especializado

public class RoupaDeCaveira extends Fantasia {

    public RoupaDeCaveira(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String nomeDoPersonagem() {
        return "Uma Caveira com a voz do " + pessoa.obterNome();
    }

    @Override
    public String descricaoDaRoupa() {
        return "Roupa preta inteira com desenho dos ossos";
    }
}
