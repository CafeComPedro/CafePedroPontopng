package exerc�cio06;

import javax.swing.JOptionPane;

public class Princiapal {
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um N�mero: "));		
		if((valor1 == valor2)) {
			System.out.println(valor1+valor2);
		}else {
			System.out.println(valor1*valor2);
		}
		
	}
}
