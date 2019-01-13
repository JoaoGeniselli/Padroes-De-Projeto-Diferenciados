package adapter.festa.fantasia;

// Adaptador especializado

public class RoupaDeVampiro extends Fantasia {

    public RoupaDeVampiro(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String nomeDoPersonagem() {
        return "O Vampiro " + pessoa.obterNome();
    }

    @Override
    public String descricaoDaRoupa() {
        return "Aparencia elegante com capa e uma dentadura com dentes afiados";
    }
}
