package ExerciciosHerenca1;

import javax.swing.JOptionPane;

public class TestarAnimais {

	public static void main(String[] args) {

		Mamifero camelo = new Mamifero();

		String nome = JOptionPane.showInputDialog("Informe o nome do Animal");
		camelo.setNome(nome);
		
		float comprimento = Float.parseFloat(JOptionPane.showInputDialog("Informe o comprimento do animal"));
		camelo.setComprimento(comprimento);

		int numeroPatas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de patas do Animal"));
		camelo.setNumeroPatas(numeroPatas);

		String cor = JOptionPane.showInputDialog("Informe a cor do Animal");
		camelo.setNumeroPatas(numeroPatas);

		String ambiente = JOptionPane.showInputDialog("Informe o ambiente que o animal vive");
		camelo.setAmbiente(ambiente);
		
		float velocidadeMedia = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade média do animal"));
		camelo.setVelocidadeMedia(velocidadeMedia);
		
		String alimento = JOptionPane.showInputDialog("Informe o alimento que o animal consume");
		camelo.setAlimento(alimento);
				

		camelo.dadosMamifero();
		
	}

}
