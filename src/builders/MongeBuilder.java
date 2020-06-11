package builders;

import enums.PersonagemDefault;
import enums.PersonagemEspecs;

public class MongeBuilder extends PersonagemBuilder{
	
	private String apelido;
	private static int totalMonges = 0;
	
	public MongeBuilder(String apelido) {
		this.apelido = apelido;
		totalMonges++;
	}
	
	public static int getTotalMonges() {
		return totalMonges;
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
		personagem.setEspecs(PersonagemEspecs.MONGE);
	}
}
