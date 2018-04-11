class TesteAnimais{
	public static void main(String[] args){
		Mamifero camelo = new Mamifero("Camelo", "Amarelo", "Humanos bem passados", 150, 2, 4);
		Peixe tubarao = new Peixe("Tubarão", "Barbatanas e cauda", 300, 1.5);
		Mamifero urso = new Mamifero("Urso-do-Canadá", "Vermelho", "Mel", 180, 0.5, 4);
		Mamifero baleia = new Mamifero("Baleia Azul", "Amarelo, obviamente", "Muuuuito peixe", 240, 50*60, 0);

		System.out.println("Zoo:");
		camelo.dados();
		tubarao.dados();
		urso.dados();
		baleia.dados();
	}
}
