package exerc�cio28;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		
		System.out.println(numero % 2 == 0 ? "N�mero par!" : "N�mero �mpar!");
		
		if((numero > 0)) {
			System.out.println("N�mero positivo!");
		}else if((numero < 0)) {
			System.out.println("N�mero negativo!");
		}
				
	}

}
