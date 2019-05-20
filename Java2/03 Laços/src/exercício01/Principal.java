package exercício01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Object[] carg = {"gerente", "Atendente", "Açougueiro",  "Secretária", "Almoxarife", "Padeiro", "Estagiário"};
		Object[] gene = {"Masculino", "Feminino"};
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		int maior=0, menor=0;
		int Masculino = 0, Feminino = 0;
		int gen, continuar = 0;
		int idade;
		int continuaro = 0;
		
		int Gerente = 0, Atendente = 0, Açogueiro = 0, Secertária = 0, Almoxerife = 0, Padeiro = 0, Estágiario = 0;
		int car, continuara = 0;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade: ")); 
		if(idade >= 18) {
			maior++;
		}else {
			menor++;
		}
		
		
		
		String resultada = "Quantidade de maiores e menores de 18 anos: ";
	     resultada+="\nMenor de 18: "+menor;
	     resultada+="\nMaior de 18: "+maior;
	
	     continuaro = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	      
	
	     		JOptionPane.showMessageDialog(null, resultada);
	     
				
		do {
			gen= JOptionPane.showOptionDialog(null, "Qual é o seu gênero?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, gene, 0);
		switch (gen) {
		case 0:
			Masculino++;
			break;
		case 1:
			Feminino++;
			break;
		
		}
continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");		
		}while(continuar == 0);
			String resultado = "Quantidade de gêneros: ";
		resultado+="\nMasculino obteve: "+Masculino;
		resultado+="\nFeminino obteve: "+Feminino;		
				JOptionPane.showMessageDialog(null, resultado);
				
			do {	
				
			  car	= JOptionPane.showOptionDialog(null, "Qual é o seu cargo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, carg, 0);	
				
			switch (car) {

			case 0:
				Atendente++;
				break;
			case 1:
				Açogueiro++;
				break;
			case 2:
				Secertária++;
				break;
			case 3:
				Almoxerife++;
				break;
			case 4:
				Padeiro++;
				break;
			case 5:
				Estágiario++;
				break;
		}
continuara = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	    }while(continuara == 0);
	    	String resultad = "Quantidade de trabalhadores em cada cargo: ";
	    	resultad+="\nAtendente obteve: "+Atendente;	
	    	resultad+="\nAçogueiro obteve: "+Açogueiro;
	        resultad+="\nSecretária obteve: "+Secertária;
	        resultad+="\nAlmoxerife obteve: "+Almoxerife;	
	    	resultad+="\nPadeiro obteve: "+Padeiro;
	        resultad+="\nEstágiario obteve: "+Estágiario;	
	        	JOptionPane.showMessageDialog(null, resultad);
	        	
	   
	     
	}
		}
