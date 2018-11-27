package adapter.festa.fantasia;

// Adaptador especializado

public class RoupaDeFantasma extends Fantasia {

	public RoupaDeFantasma(Pessoa pessoa) {
		super(pessoa);
	}

	@Override
	public String nomeDoPersonagem() {
		return "O Fantasma " + pessoa.obterNome();
	}

	@Override
	public String descricaoDaRoupa() {
		return "Um lençol com furos para os olhos";
	}

	@Override
	public String bebidaFavorita() {
		return pessoa.obterBebidaFavorita();
	}
}
