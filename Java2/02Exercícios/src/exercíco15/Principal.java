package exerc�co15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String apto = JOptionPane.showInputDialog(null, "Voc� deseja o apto. simples, duplo o o de luxo? ");
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias voc� deseja ficar?"));
		
		if(apto.equals("apto simples")) {
			System.out.println("O pre�o ser�: R$"+dias*45);
		}else if(apto.equals("apto duplo")) {
			System.out.println("O pre�o ser�: R$"+dias*65);
	}else if(apto.equals("apto de luxo")) {
		System.out.println("O pre�o ser�: R$"+dias*110);
	}else {
		System.out.println("por favor, escolha uma das op��es");
	}
	}
}
