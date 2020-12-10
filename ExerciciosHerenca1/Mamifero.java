package ExerciciosHerenca1;

public class Mamifero extends Animal {

	String alimento;

	public void mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente,
			float velocidadeMedia, String alimento) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
		this.alimento = alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void dadosMamifero() {
		System.out.println("Nome: " + getNome());
		System.out.println("Comprimento: " + getComprimento() + " cm");
		System.out.println("Número de Patas: " + getNumeroPatas());
		System.out.println("Cor; " + getCor());
		System.out.println("Ambiente: " + getAmbiente());
		System.out.println("Velocidade Média: " + getVelocidadeMedia() + " m/s");
		System.out.println("Característica: " + getAlimento());
	}
}
