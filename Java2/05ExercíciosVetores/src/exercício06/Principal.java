package exercício06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[] nomes = new String [10];
		
		
		//variaveis
		String nome = "aa";
		boolean existe = false;
		int indice=0;
		
		//inicializar o veotr de nomes
		for(int i=0; i<10; i++) {
			nome[i] = "";
		}
		//Laço
		while(indice<10) {
				
				//inicializar a variavek existe
				existe = false;
				
				//Perguntar o nome
				nome = JOptionPane.showInputDialog("Informe o "+(indice+1)+" nome");
				
				//Verifica se o nome existe no vetor
				for(int i = 0; i<10; i++) {
					if(nomes[i].equals(nome)) {
						existe = true;
					}
				}
				//condicional
				if(existe == false) {
					nomes[indice] = nome;
			 		indice++;
				}
										}
}
}


