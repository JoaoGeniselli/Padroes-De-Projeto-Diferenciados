package adapter.festa.fantasia;

public class ExemploFestaFantasia {

	public static void main(String[] args) {
			
		FestaDeHalloween festa = new FestaDeHalloween();
		
		// Primeiros participantes a chegar
		
		Pessoa joao = new Pessoa("João", "Refrigerante");
		Pessoa lucas = new Pessoa("Lucas", "Suco de Laranja");
		Pessoa gabriel = new Pessoa("Gabriel", "Cerveja");
		Pessoa fabio = new Pessoa("Fabio", "Refrigerante");
		
		festa.entrar(new RoupaDeFantasma(joao));
		festa.entrar(new RoupaDeVampiro(lucas));
		festa.entrar(new RoupaDeCaveira(gabriel));
		festa.entrar(new RoupaDeVampiro(fabio));
		
		festa.exibirParticipantesQueBebem("Refrigerante");
		// Saída: João e Fábio
		
		festa.exibirTodosOsParticipantes();
	}

}
