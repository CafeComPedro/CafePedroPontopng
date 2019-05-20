package exercício28;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		
		System.out.println(numero % 2 == 0 ? "Número par!" : "Número ímpar!");
		
		if((numero > 0)) {
			System.out.println("Número positivo!");
		}else if((numero < 0)) {
			System.out.println("Número negativo!");
		}
				
	}

}
