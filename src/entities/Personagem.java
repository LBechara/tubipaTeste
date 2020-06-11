package entities;

import enums.PersonagemEspecs;

public class Personagem {
	
	private int level;
	private int vida;
	private int mana;
	private String apelido;
	private int xp;
	private PersonagemEspecs especs;
	private static int totalBonecos;
	
	public Personagem () {
		totalBonecos++;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int pontosDeXp) {
		this.xp = pontosDeXp;
	}
	public PersonagemEspecs getEspecs() {
		return especs;
	}
	public void setEspecs(PersonagemEspecs especs) {
		this.especs = especs;
	}
	public static int getTotalBonecos() {
		return totalBonecos;
	}
}
