package ExerciciosHerenca1;

//teste

public class Animal {

	private String nome;
	private float comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;
	
	public void animal(String nome,float comprimento,int numeroPatas, String cor, String ambiente, float velocidadeMedia ) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia =  velocidadeMedia;
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	public float getComprimento() {
		return comprimento;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	public int getNumeroPatas() {
		return numeroPatas;
		
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setAmbiente(String ambiente) {
	this.ambiente = ambiente;	
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	
	public void dados() {
		System.out.println("Nome: "+ getNome());
		System.out.println("Comprimento: "+ getComprimento());
		System.out.println("Número de Patas: "+getNumeroPatas());
		System.out.println("Cor; "+getCor());
		System.out.println("Ambiente: "+getAmbiente());
		System.out.println("Velocidade Média: "+getVelocidadeMedia());
	}
}
