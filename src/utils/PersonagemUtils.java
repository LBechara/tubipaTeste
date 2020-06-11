package utils;

import entities.Personagem;

public class PersonagemUtils {
	
	public static int calculaExp(Personagem personagem) {
		
		if(personagem.getXp() > 99 && personagem.getXp() <= 500) {
			personagem.setLevel(1);
		}
		else if(personagem.getXp() > 500 && personagem.getXp() <= 1500) {
			personagem.setLevel(2);
		}
		else if(personagem.getXp() > 1500 && personagem.getXp() <= 4500) {
			personagem.setLevel(3);
		}
		return personagem.getLevel();
	}
	
	public static void acresceBonus(Personagem personagem, int multiplicador) {
		personagem.setVida(personagem.getVida() + (multiplicador * personagem.getEspecs().getBonusVida()));
		personagem.setMana(personagem.getMana() + (multiplicador * personagem.getEspecs().getBonusMana()));
	}
}
