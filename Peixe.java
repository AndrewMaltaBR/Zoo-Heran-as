class Peixe extends Animal{
	private String caracteristica;

	public Peixe(String nome, String caracteristica, int comprimento, double velocidade){
		super(nome,"Cinzenta", "Mar", comprimento, velocidade, 0);
		this.caracteristica = caracteristica;
	}

	public void setCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica(){
		return this.caracteristica;
	}

	public void dados(){
		super.dados();
		System.out.println("Característica: "+this.caracteristica);
	}
}
