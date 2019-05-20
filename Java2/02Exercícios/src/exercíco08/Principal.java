package exercíco08;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
	
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		String calculo = JOptionPane.showInputDialog(null, "Digite uma operação");
		
		if(calculo.equals("soma")) {
				System.out.println(numero1+numero2);
		}if(calculo.equals("subtração")) {
			System.out.println(numero1-numero2);
		}if(calculo.contentEquals("divisão")) {
			System.out.println(numero1/numero2);
		}if(calculo.equals("multiplicação")) {
			System.out.println(numero1*numero2);
		}
	
	}

}
