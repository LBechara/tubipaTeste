package builders;

import enums.PersonagemDefault;
import enums.PersonagemEspecs;

public class EspadachimBuilder extends PersonagemBuilder{
	
	private String apelido;
	private static int totalEspadachins = 0;
	
	public EspadachimBuilder(String apelido) {
		this.apelido = apelido;
		totalEspadachins++;
	}
	
	public static int gettotalEspadachins() {
		return totalEspadachins;
	}
	
	@Override
	public void buildApelido() {
		personagem.setApelido(this.apelido);
	}
	
	@Override
	public void buildLevel() {
		personagem.setLevel(PersonagemDefault.LEVEL.getValor());
	}

	@Override
	public void buildVida() {
		personagem.setVida(PersonagemDefault.VIDA.getValor());
	}

	@Override
	public void buildMana() {
		personagem.setMana(PersonagemDefault.MANA.getValor());
	}

	@Override
	public void buildXp() {
		personagem.setXp(PersonagemDefault.XP.getValor());
	}

	@Override
	public void buildEspecs() {
		personagem.setEspecs(PersonagemEspecs.ESPADACHIM);
	}
}
