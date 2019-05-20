package exercício02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nome;
		int idade, cadastrados=0;
		double peso = 0, altura=0, Somalturas=0, Medialtura = 0;
		double pesoMaior = 0, alturaMaior = 0, idadeMaior = 0; 
		String Maioratleta = null, Atletapesado = null, Atletavelho = null; 
		
		do {
			nome = JOptionPane.showInputDialog("informe seu nome: ");			
			if(!nome.equals("sair")) {
				cadastrados++;		
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade: "));
				peso = Double.parseDouble(JOptionPane.showInputDialog("Infomre peso: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Informe altura: "));	
		    
				Somalturas+=altura;
		    if( alturaMaior < altura) {
				alturaMaior=altura;
				Maioratleta= nome;}
		    
		    if (pesoMaior < peso) {
		    	pesoMaior = peso;
		    	Atletapesado = nome;
		    	Atletapesado = nome;}
		    
			if(idadeMaior < idade) {
				idadeMaior = idade;
				Atletavelho = nome;}
			
		}
		}while(!nome.equals("sair"));
		 
		Medialtura = Somalturas/cadastrados;
		
		String resultado = "Sobre os jogadores do time: ";
		resultado+="\nJogadores cadastrados: "+cadastrados;
		resultado+="\nMaior jogador: "+Maioratleta+"   Altura: "+alturaMaior;
		resultado+="\nJogador mais velho: "+Atletavelho+"   Idade: "+idadeMaior;
		resultado+="\nJogador mais pesado: "+Atletapesado+"   Peso: "+pesoMaior;
		resultado+="\nMedia das alturas dos jogadores: "+Medialtura;
		JOptionPane.showMessageDialog(null, resultado);
						
	}
}
