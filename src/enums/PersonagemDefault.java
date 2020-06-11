package enums;

public enum PersonagemDefault {
	LEVEL(0),
	VIDA(100),
	MANA(50),
	XP(0);
	
	private int valor;
	
	PersonagemDefault(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
