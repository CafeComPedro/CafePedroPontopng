package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		String cidade = JOptionPane.showInputDialog(null, "Qual sua cidade?");
		
		String mensagem = "Nome "+nome;
		       mensagem += "\nIdade "+idade;
		       mensagem += "\nCidade"+cidade;
		       
		 JOptionPane.showMessageDialog(null, mensagem);
		 
	}

}
