package builders;

import entities.Personagem;

public abstract class PersonagemBuilder {
	
	public Personagem personagem = new Personagem();
	public abstract void buildLevel();
	public abstract void buildVida();
	public abstract void buildMana();
	public abstract void buildApelido();
	public abstract void buildXp();
	public abstract void buildEspecs();
	
	public Personagem getPersonagem() {
		return personagem;
	}
	
}
