class Animal {
	private String nome;
	private int comprimento;
	private String cor;
	private String ambiente;
	private double velocidade; // em m/s
	private int patas;

	public Animal(String nome, String cor, String ambiente, int comprimento, double
velocidade, int patas){
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = patas;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setComprimento(int comprimento){
		this.comprimento = comprimento;
	}

	public void setPatas(int patas){
		this.patas = patas;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public void setAmbiente(String ambiente){
		this.ambiente = ambiente;
	}

	public void setVelocidade(double velocidade){
		this.velocidade = velocidade;
	}

	public void dados(){
		System.out.println("----------------------------------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Comprimento: "+this.comprimento+" cm");
		System.out.println("Número de patas: "+this.patas);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ambiente: "+this.ambiente);
		System.out.println("Velocidade: "+this.velocidade+" m/s");
	}
}
