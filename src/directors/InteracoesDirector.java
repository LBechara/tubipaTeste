package directors;

import entities.Personagem;
import utils.PersonagemUtils;

public class InteracoesDirector {
	
	public static void ganhaExp(Personagem personagem, int xp) {
		int levelAnterior = personagem.getLevel();
		
		personagem.setXp(personagem.getXp() + xp);
		System.out.println(personagem.getApelido() + " ganhou " + xp + " pontos de experi�ncia");
		PersonagemUtils.calculaExp(personagem);
		
		if(personagem.getLevel() > levelAnterior) {
			int multiplicador = personagem.getLevel() - levelAnterior;
			
			System.out.println("Parab�ns, voc� acaba de subir para o level " + personagem.getLevel());
			PersonagemUtils.acresceBonus(personagem, multiplicador);
		}
	}
	
	public static void atacar(Personagem atacante, Personagem defensor) {
		
	}
}
