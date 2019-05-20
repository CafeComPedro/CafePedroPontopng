package exercício27;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Que ano que estamos?"));
				
				System.out.println(ano % 4 == 0 ? "Estamos em um ano bissexto!" : "Não estamos em um ano bissexto!");
	}

}
