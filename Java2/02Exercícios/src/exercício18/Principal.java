package exercício18;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int ld = Integer.parseInt(JOptionPane.showInputDialog("Comprimento do lado direito do triângulo:"));
		int le = Integer.parseInt(JOptionPane.showInputDialog("Comprimento do lado esquerdo do triângulo"));
		int li = Integer.parseInt(JOptionPane.showInputDialog("Comprimento do lado inferior do triângulo"));
		
		if((ld >= le+li) || (le >= ld+li) || (li >= le+ld)) {
			System.out.println("Não é um triângulo");
			
		}else if((ld == le) && (le == li)) {
			System.out.println("É um triângulo equilatero");
			
		}else if((ld == le) || (ld == li) || (le == li)) {
			System.out.println("É um triângulo isóceles");
			
		}else if((ld != le) && (le != li)) {
			System.out.println("É um triângulo escaleno");
		}
}
}
