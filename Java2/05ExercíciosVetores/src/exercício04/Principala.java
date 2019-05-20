package exercício04;

import javax.swing.JOptionPane;

public class Principala {

	public static void main(String[] args) {
		
		//Gabarito
		String[] gabarito = {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"};
		
		//Alunos
		String nome;
		String[] nomes = new String[10];
		String[] resposta = new String[10];
		int[] acertos = new int[10];
		int[] erros = new int[10];
		int indice = 0;
		
		//Laço
		nome = JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar");
		
		do { 
			
			//Atribuir o nome do aluno no vetor
			nomes[indice] = nome;
			
			//Respostas do aluno
			for(int i=0; i<10; i++) {
				resposta[indice] = JOptionPane.showInputDialog((i+1)+" resposta");
			}
			//Contagem
			for(int i=0; i<10; i++) {
				if(gabarito[i].equals(resposta[i])) {
					acertos[indice]++;
				}else {
	
				}}}while(!nome.equals("sair"));
}
}