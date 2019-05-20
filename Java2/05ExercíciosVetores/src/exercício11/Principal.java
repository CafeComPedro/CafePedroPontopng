package exercício11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		//Matriz
		String[][] dados =  new String[20][6];
		
		//Índice
		int indice=0;
		
		//Continuar
		int continuar = 0;
		
		//laço
		do {
			//Obter dados
			dados[indice][0] = JOptionPane.showInputDialog("Nome");
			dados[indice][1] = JOptionPane.showInputDialog("sexo");
			dados[indice][2] = JOptionPane.showInputDialog("Altura");
			dados[indice][3] = JOptionPane.showInputDialog("Peso");
			
			//Incrementar o indice
			indice++;
			//Perguntar se deseja continuar
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						
		}while(continuar != 1);
	}

}
