package exerc�cio18;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int ld = Integer.parseInt(JOptionPane.showInputDialog("Comprimento do lado direito do tri�ngulo:"));
		int le = Integer.parseInt(JOptionPane.showInputDialog("Comprimento do lado esquerdo do tri�ngulo"));
		int li = Integer.parseInt(JOptionPane.showInputDialog("Comprimento do lado inferior do tri�ngulo"));
		
		if((ld >= le+li) || (le >= ld+li) || (li >= le+ld)) {
			System.out.println("N�o � um tri�ngulo");
			
		}else if((ld == le) && (le == li)) {
			System.out.println("� um tri�ngulo equilatero");
			
		}else if((ld == le) || (ld == li) || (le == li)) {
			System.out.println("� um tri�ngulo is�celes");
			
		}else if((ld != le) && (le != li)) {
			System.out.println("� um tri�ngulo escaleno");
		}
}
}
