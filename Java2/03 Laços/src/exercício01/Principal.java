package exerc�cio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Object[] carg = {"gerente", "Atendente", "A�ougueiro",  "Secret�ria", "Almoxarife", "Padeiro", "Estagi�rio"};
		Object[] gene = {"Masculino", "Feminino"};
		
		String nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		
		int maior=0, menor=0;
		int Masculino = 0, Feminino = 0;
		int gen, continuar = 0;
		int idade;
		int continuaro = 0;
		
		int Gerente = 0, Atendente = 0, A�ogueiro = 0, Secert�ria = 0, Almoxerife = 0, Padeiro = 0, Est�giario = 0;
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
			gen= JOptionPane.showOptionDialog(null, "Qual � o seu g�nero?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, gene, 0);
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
			String resultado = "Quantidade de g�neros: ";
		resultado+="\nMasculino obteve: "+Masculino;
		resultado+="\nFeminino obteve: "+Feminino;		
				JOptionPane.showMessageDialog(null, resultado);
				
			do {	
				
			  car	= JOptionPane.showOptionDialog(null, "Qual � o seu cargo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, carg, 0);	
				
			switch (car) {

			case 0:
				Atendente++;
				break;
			case 1:
				A�ogueiro++;
				break;
			case 2:
				Secert�ria++;
				break;
			case 3:
				Almoxerife++;
				break;
			case 4:
				Padeiro++;
				break;
			case 5:
				Est�giario++;
				break;
		}
continuara = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	    }while(continuara == 0);
	    	String resultad = "Quantidade de trabalhadores em cada cargo: ";
	    	resultad+="\nAtendente obteve: "+Atendente;	
	    	resultad+="\nA�ogueiro obteve: "+A�ogueiro;
	        resultad+="\nSecret�ria obteve: "+Secert�ria;
	        resultad+="\nAlmoxerife obteve: "+Almoxerife;	
	    	resultad+="\nPadeiro obteve: "+Padeiro;
	        resultad+="\nEst�giario obteve: "+Est�giario;	
	        	JOptionPane.showMessageDialog(null, resultad);
	        	
	   
	     
	}
		}
