package equals;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

	//Criar duas variaveis e realizar a captura de informa��es
		String nome1 =  JOptionPane.showInputDialog("Informe o primeiro nome");
		String nome2 =  JOptionPane.showInputDialog("Informe o segundo nome");

	//Realizando o comparativo
		if(nome1.equals(nome2)) {
			JOptionPane.showMessageDialog(null, "S�o iguais");
		
		}else {
			JOptionPane.showMessageDialog(null, "S�o diferentes");
		}
	}

}
