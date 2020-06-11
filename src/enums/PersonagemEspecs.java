package enums;

public enum PersonagemEspecs {
	MONGE("Monge", 20, 25),
	ESPADACHIM("Espadachim", 30, 15);
	
	public String classe;
	public int vida;
	public int mana;
	
	PersonagemEspecs(String classe, int vida, int mana) {
        this.classe = classe;
        this.vida = vida;
        this.mana = mana;
    }

    public String getClasse() {
        return this.classe;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    public int getMana() {
        return this.mana;
    }
	
}
