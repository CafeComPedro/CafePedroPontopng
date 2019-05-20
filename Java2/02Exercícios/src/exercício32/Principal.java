package exercício32;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int orç = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu orçamento?"));
		
	if((orç > 0)) {
		System.out.println(orç*0.05+orç);
		System.out.println(orç*0.1+orç);
		System.out.println(orç*0.2+orç);
		System.out.println(orç*0.3+orç);
		System.out.println(orç*0.4+orç);
		System.out.println(orç*0.5+orç);
	}
	}

}
