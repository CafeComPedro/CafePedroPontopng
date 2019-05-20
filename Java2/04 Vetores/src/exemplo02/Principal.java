package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//vetor
		String[] nomes = new String[3];
		
		//Obter os tres nomes
		for(int i = 0; i<3; i++) {
			nomes[i] = JOptionPane.showInputDialog((i+1)+" nome");
		}
		
		//Foreach - Executa cada posição do vetor
		
		for(String elemento : nomes) {
			System.out.println(elemento);
		}
	}

}
