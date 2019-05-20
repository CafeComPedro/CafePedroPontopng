package exercício06;

import javax.swing.JOptionPane;

public class Princiapal {
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um Número: "));		
		if((valor1 == valor2)) {
			System.out.println(valor1+valor2);
		}else {
			System.out.println(valor1*valor2);
		}
		
	}
}
