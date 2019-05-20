package exercício03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int cod, contador = 0;
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu pagamento: "));
		
		do {
			cod = Integer.parseInt(JOptionPane.showInputDialog("Digite seu código"));
			if((cod = 1) || (cod = 2) || (cod = 3) || (cod = 4) || (cod = 5) || (cod = 6) || (cod = 7)) {
				contador++;
		}
		}while((cod = 1) || (cod = 2) || (cod = 3) || (cod = 4) || (cod = 5) || (cod = 6) || (cod = 7));
		
		
		
	
		

	}

}
