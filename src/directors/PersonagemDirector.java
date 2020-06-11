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
	
	public void ganhaExp(int xp) {
		Personagem personagemStatus = personagem.getPersonagem();
		int levelAnterior = personagemStatus.getLevel();
		
		personagemStatus.setXp(personagemStatus.getXp() + xp);
		System.out.println(personagemStatus.getApelido() + " ganhou " + xp + " pontos de experiência");
		PersonagemUtils.calculaExp(personagemStatus);
		
		if(personagemStatus.getLevel() > levelAnterior) {
			int multiplicador = personagemStatus.getLevel() - levelAnterior;
			
			System.out.println("Parabéns, você acaba de subir para o level " + personagemStatus.getLevel());
			PersonagemUtils.acresceBonus(personagemStatus, multiplicador);
		}
	}
	
	
}
