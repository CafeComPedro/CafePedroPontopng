package exercício05;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de fevereiro:"));
		
		if((dia > 28) || (dia < 1)) {
			JOptionPane.showMessageDialog(null, "Data inválida");
		}else if((dia == 2) || (dia == 9) || (dia == 16) || (dia == 23) || (dia == 3) || (dia == 10) || (dia == 17) || (dia == 24)) {
			JOptionPane.showMessageDialog(null, "Final de semana!");
		}else { 
			JOptionPane.showMessageDialog(null, "Dia de semana...");
		}
	}
}