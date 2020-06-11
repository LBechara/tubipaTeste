package tubipaTeste;

import builders.EspadachimBuilder;
import builders.MongeBuilder;
import directors.InteracoesDirector;
import directors.PersonagemDirector;
import entities.Personagem;

public class TestJogo {

	public static void main(String[] args) {
		
		PersonagemDirector banana = new PersonagemDirector(new MongeBuilder("banana"));
		PersonagemDirector tremax = new PersonagemDirector(new EspadachimBuilder("tremax"));
		banana.criaPersonagem();
		tremax.criaPersonagem();
		 
		System.out.println("------------BANANA------------");
		System.out.println("classe: " + banana.getPersonagem().getEspecs().getClasse());
		System.out.println("level: " + banana.getPersonagem().getLevel());
		System.out.println("experiênca: " + banana.getPersonagem().getXp());
		System.out.println("vida: " + banana.getPersonagem().getVida());
		System.out.println("mana: " + banana.getPersonagem().getMana());
		System.out.println("------------TREMAX------------");
		System.out.println("classe: " + tremax.getPersonagem().getEspecs().getClasse());
		System.out.println("level: " + tremax.getPersonagem().getLevel());
		System.out.println("experiênca: " + tremax.getPersonagem().getXp());
		System.out.println("vida: " + tremax.getPersonagem().getVida());
		System.out.println("mana: " + tremax.getPersonagem().getMana());
		
		System.out.println();
		
		InteracoesDirector.ganhaExp(banana.getPersonagem(), 499);
		InteracoesDirector.ganhaExp(tremax.getPersonagem(), 501);
		
		System.out.println();
		
		System.out.println("------------BANANA------------");
		System.out.println("level: " + banana.getPersonagem().getLevel());
		System.out.println("experiênca: " + banana.getPersonagem().getXp());
		System.out.println("vida: " + banana.getPersonagem().getVida());
		System.out.println("mana: " + banana.getPersonagem().getMana());
		System.out.println("------------TREMAX------------");
		System.out.println("level: " + tremax.getPersonagem().getLevel());
		System.out.println("experiênca: " + tremax.getPersonagem().getXp());
		System.out.println("vida: " + tremax.getPersonagem().getVida());
		System.out.println("mana: " + tremax.getPersonagem().getMana());
		System.out.println("total jogadores: " + Personagem.getTotalBonecos());
		System.out.println("total monges: " + MongeBuilder.getTotalMonges());
	}
}