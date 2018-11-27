package adapter.festa.fantasia;

// Classe adaptada

public class Pessoa {
	
	private String nome;
	private String bebidaFavorita;
	
	public Pessoa(String nome, String bebidaFavorita) {
		super();
		this.nome = nome;
		this.bebidaFavorita = bebidaFavorita;
	}
	
	public String obterNome() {
		return nome;
	}
	
	public String obterBebidaFavorita() {
		return bebidaFavorita;
	}
	

}
