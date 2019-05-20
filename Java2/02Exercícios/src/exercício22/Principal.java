package exercício22;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		 
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do lado 1"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do lado 2"));
		int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do lado 3"));
		int lado4 = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do lado 4"));
		
		if((lado1 == lado2) && (lado2 == lado3) && (lado3 == lado4)) {
			System.out.println("Objeto analizado é um quadrado! :D");
		}else {
			System.out.println("Objeto analizado não é um quadrado... D:");
		}
				

	}

}
