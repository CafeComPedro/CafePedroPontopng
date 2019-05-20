package exercício12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int velperm = Integer.parseInt(JOptionPane.showInputDialog("Velocidade permitida: "));
		int velveic = Integer.parseInt(JOptionPane.showInputDialog("Velocidade do veiculo "));
		
		if((velperm > velveic)) {
			System.out.println("Bom motorista!");
		}if((velveic > velperm) && (velveic < 11 + velperm )) {
			System.out.println("R$50,00 de multa");
		}if((velveic >= 11 + velperm) && (velveic < 30 + velperm)) {
			System.out.println("R$100,00 de multa");
		}if((velveic > 30 + velperm)) {
			System.out.println("R$200,00 de multa >:(");
		}
			
	}
}
