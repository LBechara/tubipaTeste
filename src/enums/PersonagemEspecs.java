package enums;

public enum PersonagemEspecs {
	MONGE("Monge", 20, 25, 5, 2),
	ESPADACHIM("Espadachim", 30, 15, 5, 2);
	
	public String classe;
	public int bonusVida;
	public int bonusMana;
	public int ataque;
	public int defesa;
	
	PersonagemEspecs(String classe, int bonusVida, int bonusMana, int ataque, int defesa) {
        this.classe = classe;
        this.bonusVida = bonusVida;
        this.bonusMana = bonusMana;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getClasse() {
        return this.classe;
    }
    
    public int getBonusVida() {
        return this.bonusVida;
    }
    
    public int getBonusMana() {
        return this.bonusMana;
    }
    
    public int getAtaque() {
    	return this.ataque;
    }
    
    public int getDefesa() {
    	return this.defesa;
    }
	
}
