package exerc�co08;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
	
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		String calculo = JOptionPane.showInputDialog(null, "Digite uma opera��o");
		
		if(calculo.equals("soma")) {
				System.out.println(numero1+numero2);
		}if(calculo.equals("subtra��o")) {
			System.out.println(numero1-numero2);
		}if(calculo.contentEquals("divis�o")) {
			System.out.println(numero1/numero2);
		}if(calculo.equals("multiplica��o")) {
			System.out.println(numero1*numero2);
		}
	
	}

}
