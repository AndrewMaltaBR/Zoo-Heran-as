class Mamifero extends Animal{
	private String alimento;

	public Mamifero(String nome, String cor, String alimento,int comprimento, double velocidade, int patas){
		super(nome, cor, "Terra", comprimento, velocidade, patas);
		this.alimento = alimento;
	}
		
	public void setAlimento(String alimento){
		this.alimento = alimento;
	}

	public String getAlimento(){
		return this.alimento;
	}

	public void dados(){
		super.dados();
		System.out.println("Alimento preferido: "+this.alimento);
	}
}
