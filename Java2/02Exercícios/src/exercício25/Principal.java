package exercício25;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Que horas são"));
		
		if((hora >= 0) && (hora <= 6)) {
			System.out.println("Boa madrugada!");
		}else if((hora >=7) && (hora <= 11)) {
			System.out.println("Bom dia!");
		}else if((hora >=12) && (hora <= 18)) {
			System.out.println("Boa tarde!");
		}else if((hora >=19) && (hora <= 23)) {
			System.out.println("Bom noite!");
		}else {
			System.out.println("Boa hora inválida!");
		}
	}

}
