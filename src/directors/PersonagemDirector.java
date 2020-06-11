package directors;

import builders.PersonagemBuilder;
import entities.Personagem;
import utils.PersonagemUtils;

public class PersonagemDirector {
	
	public PersonagemBuilder personagem;
	
	public PersonagemDirector(PersonagemBuilder personagem) {
		this.personagem = personagem;
	}
	
	public void criaPersonagem() {
		personagem.buildApelido();
		personagem.buildEspecs();
		personagem.buildLevel();
		personagem.buildMana();
		personagem.buildVida();
		personagem.buildXp();
	}
	
	public Personagem getPersonagem() {
		return personagem.getPersonagem();
	}
}
