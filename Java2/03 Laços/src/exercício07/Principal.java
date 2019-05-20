package exercício07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String e = "e";
		String s = "s";
		String t = "t";
		String u = "u";
		String d = "d";
		String a = "a";
		String r = "r";
		String resposta;
		int tentativas = 0;
		int continuar = 0;
		
		
		
		do {
			resposta = JOptionPane.showInputDialog("Adivinhe a palavra secreta! Você tem 5 tentativas.");
			
if ((!resposta.equals(e)) || (!resposta.equals(s)) || (!resposta.equals(t)) || (!resposta.equals(u)) || (!resposta.equals(d)) || (!resposta.equals(a)) || (!resposta.equals(r))) {
	tentativas++; 
	continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	}else if  ((resposta.equals("e")) || (resposta.equals("s")) || (resposta.equals("t")) || (resposta.equals("u")) || (resposta.equals("d")) || (resposta.equals("a")) || (resposta.equals("r"))) {
		JOptionPane.showMessageDialog(null, "Parabéns! você acertou uma letra!");		
		
	}
}while ((continuar == 0));


		
		
}
}


