package ExerciciosHerenca1;

public class Peixe extends Animal {

	private String caracteristicas;

	public void dadosPeixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente,
			float velocidadeMedia, String caracteristicas) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
		this.caracteristicas = caracteristicas;

	}


	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristica() {
		return caracteristicas;
	}

	public void dadosPeixe() {
		System.out.println("Nome: " + getNome());
		System.out.println("Comprimento: " + getComprimento());
		System.out.println("Número de Patas: " + getNumeroPatas());
		System.out.println("Cor; " + getCor());
		System.out.println("Ambiente: " + getAmbiente());
		System.out.println("Velocidade Média: " + getVelocidadeMedia());
		System.out.println("Característica: "+getCaracteristica());
	}
}
