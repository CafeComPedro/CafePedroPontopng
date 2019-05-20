package exercício30;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int valhora = Integer.parseInt(JOptionPane.showInputDialog("Valor ganho por hora:"));
		int horatrab = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas você trabalha normalmente?"));
		int horamais = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas trabalhas com 100% de acréscimo"));
		
		JOptionPane.showMessageDialog(null, valhora*horatrab + horamais*valhora);
				
	}

}
