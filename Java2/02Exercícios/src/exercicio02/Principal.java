package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do produto?"));
		JOptionPane.showMessageDialog(null, "O valor do produto com desconto é "+valor*0.90);

	}

}
